

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class JuegueteElectrico extends Jueguete implements Comparable<JuegueteElectrico>{
    double valorFinal = this.getValorUnitario()+2*this.getValorAgregado();
    public JuegueteElectrico(String codigo, String marca, double valorUnitario, double valorAgregado, int edadMinima, int numProveedor) {
        super(codigo, marca, valorUnitario, valorAgregado, edadMinima, numProveedor);
    }

    public double valorFinal() {
        return valorFinal;
    }
    
    @Override
    public int compareTo(JuegueteElectrico e1){
        
        return new Double(e1.valorFinal).compareTo(this.valorFinal);
    }

    @Override
    public String toString() {
        return "JuegueteElectrico{" + "valorFinal=" + valorFinal + '}';
    }
    
}
  



