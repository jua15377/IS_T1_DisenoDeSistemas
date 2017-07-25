
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

        System.out.println("Menu de Opciones de la Juguetería \n1. Ver cantidad de juguetes por proveedor\n2. Ver juguetes por Complejidad\n3. Agregar provedor \n4. eliminar provedor\n5. actualizar provedor\nSelecciona una opcion: ");
        int seleccion = sc.nextInt();
        if(seleccion==1){
            System.out.println("Usted esta visualizando los proveedores");
            System.out.println("Porfavor ingrese el codigo del proveedor para ver la cantidad de juguetes totales que ofrece: ");
            int numProveedor = sc.nextInt();
            miControl.cjProveedor(numProveedor);     
        }
        else if(seleccion==2){
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
        else if(seleccion==3){
            System.out.println("Ingres el nombre del proveedor ");
            String nameProv = sc.next();
            System.out.println("Ingres el numero de proveedor");
            int numProv = sc.nextInt();
            System.out.println("Ingres la cantidad de juguetes mecanicos ");
            int cantMeca = sc.nextInt();
            System.out.println("Ingres la cantidad de juguetes electronicos ");
            int  cantElecto = sc.nextInt();
            Proveedor nuevoProveedor = new Proveedor(nameProv,numProv,cantMeca,cantElecto);
            miControl.crearProveedor(nuevoProveedor);
        }
        else if(seleccion==4) {
            System.out.println("Ingres el numero de proveedor a eliminar ");
            int num = sc.nextInt();
            miControl.eliminarProveedor(num);
        }
        else if(seleccion==5){
            System.out.println("Ingres el numero de proveedor a actualizar");
            int numProv = sc.nextInt();
            System.out.println("Los nuevos valores del proveedor ");
            System.out.println("Ingres el nombre del proveedor ");
            String nameProv = sc.next();
            System.out.println("Ingres la cantidad de juguetes mecanicos ");
            int cantMeca = sc.nextInt();
            System.out.println("Ingres la cantidad de juguetes electronicos ");
            int  cantElecto = sc.nextInt();
            Proveedor nuevoProveedor = new Proveedor(nameProv,numProv,cantMeca,cantElecto);
            miControl.updateProveedor(numProv,nuevoProveedor);
        }
    }
}
