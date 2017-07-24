
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    ArrayList<JuegueteElectrico> losJuguetes = new ArrayList<>();
    
    public void sortElectricos(){
        //losJuguetes.sort(losJuguetes, (Comparator<Double>) losJuguetes.);
        
    }
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

    public ArrayList<JuegueteElectrico> getLosJuguetes() {
        return losJuguetes;
    }
    
}
