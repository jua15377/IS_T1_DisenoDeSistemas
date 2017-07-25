
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

        System.out.println("Menu de Opciones de la Juguetería \n1. Ver cantidad de juguetes por proveedor\n2. Ver juguetes por Complejidad\nSelecciona una opcion: ");
        int seleccion = sc.nextInt();
        if(seleccion==1){
            System.out.println("Usted esta visualizando los proveedores");
            System.out.println("Porfavor ingrese el codigo del proveedor para ver la cantidad de juguetes totales que ofrece: ");
            int numProveedor = sc.nextInt();
            miControl.cjProveedor(numProveedor);     
        }else{
            if(seleccion==2){
        miControl.leerElectricos();
        System.out.println("Antes de ordenar "+miControl.getLosJuguetes());
        miControl.sortElectricos();
        System.out.println("Ordenados por precio final"+miControl.getLosJuguetes());

        System.out.println("\nIngrese la complejidad deseada de los juguetes Mecanicos: ");
        int n = sc.nextInt();
        miControl.leerMecanicos();
        miControl.sortMecanicos(n);
        String impresion = miControl.impresionMecanicos();
        
        System.out.println("Los juguetes mecanicos con complejidad " + n + " son: " + impresion);

            }
        }
    }
}
