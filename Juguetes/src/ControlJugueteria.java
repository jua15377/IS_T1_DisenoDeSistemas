
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
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
    //List<JuegueteMecanico> losJuguetesM = new ArrayList<JuegueteMecanico>();
    List<JuegueteMecanico> losJuguetesMecanicos = new ArrayList<JuegueteMecanico>();
    List<JuegueteMecanico> MecanicosXComplejidad = new ArrayList<JuegueteMecanico>();
    List<Proveedor> losProveedores = new ArrayList<Proveedor>();

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
                JuegueteMecanico eljuguetem = new JuegueteMecanico(palabras[0],palabras[1],Double.parseDouble(palabras[2]),Double.parseDouble(palabras[3]),Integer.parseInt(palabras[4]),Integer.parseInt(palabras[5]), Integer.parseInt(palabras[6]));
                losJuguetesMecanicos.add(eljuguetem);
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
            //break;
        }
        for (JuegueteMecanico i : losJuguetesMecanicos){
            if (i.getComplejidad() == n){
                MecanicosXComplejidad.add(i);
            }
        }

    }

    public String impresionMecanicos(){
        String resultado = "";
        for (JuegueteMecanico i : MecanicosXComplejidad){
            resultado = resultado + i.getCodigo() + ", ";
        }
        return resultado;
    }

    public List<JuegueteElectrico> getLosJuguetes() {
        return losJuguetes;
    }
    public List<JuegueteMecanico> getlosJuguetesMecanicos(){ return losJuguetesMecanicos; }
  
    public void leerProveedores(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\proveedores.txt"));
            String linea;
            while((linea = br.readLine()) != null)
            {
                //String tmp = br.readLine();
                String[] palabras = linea.split(", ");
                Proveedor elProveedor = new Proveedor(palabras[0],Integer.parseInt(palabras[1]),Integer.parseInt(palabras[2]),Integer.parseInt(palabras[3]));
                losProveedores.add(elProveedor);
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
    
    public void cjProveedor(int numProveedor){
        leerProveedores();
        int i=losProveedores.size();
        
        int cont=0;
        for(int x=0;x<i;x++){
            Proveedor miProveedor=losProveedores.get(x);
            if(miProveedor.getNumProveedor()==numProveedor){
                System.out.println("La cantidad de juguetes totales de este proveedor es: "+ miProveedor.cantJuguetestotal());
                cont++;
            }
        }
        if(cont==0){
            System.out.println("Ningun proveedor coincide con ese codigo.");
        }
    }
    public void crearProveedor(Proveedor proveedor){
        try {
            String texto = "\n" + proveedor.toString();
                    Writer output;
            output = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\proveedores.txt",true));  //clears file every time
            output.append(texto);
            output.close();
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
    public void eliminarProveedor(){

    }
}
