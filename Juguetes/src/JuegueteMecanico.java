/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class JuegueteMecanico extends Jueguete{
    private int complejidad;
    private double vAdicional;

    public JuegueteMecanico(String codigo, String marca, double valorUnitario, double valorAgregado, int edadMinima, int numProveedor, int complejidad) {
        super(codigo, marca, valorUnitario, valorAgregado, edadMinima, numProveedor);
        this.complejidad = complejidad;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public double getvAdicional() {
        return vAdicional;
    }

    public void setvAdicional(double vAdicional) {
        this.vAdicional = vAdicional;
    }

    public double valorFinal(int complejidad, double valorUnitario, double vAdicional){
        double vFinal = valorUnitario + vAdicional*complejidad;
        return vFinal;
    }
}
