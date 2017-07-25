
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class mainJugueteria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        ControlJugueteria miControl = new ControlJugueteria();

        
        miControl.leerElectricos();
        System.out.println(""+miControl.getLosJuguetes());
        miControl.sortElectricos();
        System.out.println(""+miControl.getLosJuguetes());

        System.out.println("\nIngrese la complejidad deseada de los juguetes Mecanicos: ");
        int n = sc.nextInt();
        miControl.leerMecanicos();
        miControl.sortMecanicos(n);
        String impresion = miControl.impresionMecanicos();
        
        System.out.println("Los juguetes mecanicos con complejidad " + n + " son: " + impresion);





        
        
        
    }
}
