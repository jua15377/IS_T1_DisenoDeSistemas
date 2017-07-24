/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Jueguete {
    private String codigo, marca;
    private double valorUnitario, valorAgregado;
    private int edadMinima, numProveedor;

    public Jueguete(String codigo, String marca, double valorUnitario, double valorAgregado, int edadMinima, int numProveedor) {
        this.codigo = codigo;
        this.marca = marca;
        this.valorUnitario = valorUnitario;
        this.valorAgregado = valorAgregado;
        this.edadMinima = edadMinima;
        this.numProveedor = numProveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorAgregado() {
        return valorAgregado;
    }

    public void setValorAgregado(double valorAgregado) {
        this.valorAgregado = valorAgregado;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getNumProveedor() {
        return numProveedor;
    }

    public void setNumProveedor(int numProveedor) {
        this.numProveedor = numProveedor;
    }
    
    
}
