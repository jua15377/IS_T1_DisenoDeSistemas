/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class Proveedor {
    
    private int numProveedor=0;
    private String nombre="";
    private int cantJuguetesMecanicos=0;
    private int cantJuguetesElectricos=0;

    public Proveedor(String nombre, int numProveedor, int cantJuguetesMecanicos, int cantJuguetesElectricos) {
        this.nombre=nombre;
        this.numProveedor=numProveedor;
        this.cantJuguetesElectricos=cantJuguetesElectricos;
        this.cantJuguetesMecanicos=cantJuguetesMecanicos;
    }

    public int getNumProveedor() {
        return numProveedor;
    }

    public void setNumProveedor(int numProveedor) {
        this.numProveedor = numProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantJuguetesMecanicos() {
        return cantJuguetesMecanicos;
    }

    public void setCantJuguetesMecanicos(int cantJuguetesMecanicos) {
        this.cantJuguetesMecanicos = cantJuguetesMecanicos;
    }

    public int getCantJuguetesElectricos() {
        return cantJuguetesElectricos;
    }

    public void setCantJuguetesElectricos(int cantJuguetesElectricos) {
        this.cantJuguetesElectricos = cantJuguetesElectricos;
    }
    
    public int cantJuguetestotal(){
        int suma = getCantJuguetesMecanicos() + getCantJuguetesElectricos();
        return suma;
    }
    public String toString(){
        return this.getNombre() + ", " + this.getNumProveedor() + ", " +this.getCantJuguetesMecanicos() + ", " +this.getCantJuguetesMecanicos();
    }
}
