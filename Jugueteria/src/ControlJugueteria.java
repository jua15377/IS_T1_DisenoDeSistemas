
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class ControlJugueteria {
    List<JuegueteElectrico> losJuguetes = new ArrayList<JuegueteElectrico>();
    List<JuegueteMecanico> losJuguetesMecanicos = new ArrayList<JuegueteMecanico>();
    List<JuegueteMecanico> MecanicosXComplejidad = new ArrayList<JuegueteMecanico>();

    public void leerElectricos(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\juguetes.txt"));
            String linea;
            while((linea = br.readLine()) != null)
            {
                //String tmp = br.readLine();
                String[] palabras = linea.split(", ");
                JuegueteElectrico eljuguete = new JuegueteElectrico(palabras[0],palabras[1],Double.parseDouble(palabras[2]),Double.parseDouble(palabras[3]),Integer.parseInt(palabras[4]),Integer.parseInt(palabras[5]));
                losJuguetes.add(eljuguete);
            }
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void leerMecanicos(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\juguetesMecanicos.txt"));
            String linea;
            while((linea = br.readLine()) != null)
            {
                //String tmp = br.readLine();
                String[] palabras = linea.split(", ");
                JuegueteElectrico eljuguete = new JuegueteElectrico(palabras[0],palabras[1],Double.parseDouble(palabras[2]),Double.parseDouble(palabras[3]),Integer.parseInt(palabras[4]),Integer.parseInt(palabras[5]), Integer.parseInt[palabras[6]]);
                losJuguetes.add(eljuguete);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    public void sortElectricos(){
        Comparator.comparingDouble(JuegueteElectrico::valorFinal) ;
        Collections.sort(losJuguetes);
        
    }
    public void sortMecanicos(int n){
        if (n > 3 || n < 1){
            break;
        }
        for (JugueteMecanico i : losJuguetesMecanicos){
            if (i.getComplejidad() == n){
                MecanicosXComplejidad.add(i);
            }
        }

    }

    public String impresionMecanicos(){
        String resultado = "";
        for (JugueteMecanico i : MecanicosXComplejidad){
            resultado = resultado + i.getCodigo() + ", ";
        }
    }

    public List<JuegueteElectrico> getLosJuguetes() {
        return losJuguetes;
    }
    public List<JuegueteMecanico> getlosJuguetesMecanicos(){ return losJuguetesMecanicos; }
  
    
}
