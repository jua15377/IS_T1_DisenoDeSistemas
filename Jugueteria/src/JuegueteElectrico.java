
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
public class JuegueteElectrico extends Jueguete implements Comparator<JuegueteElectrico>{
    
    public JuegueteElectrico(String codigo, String marca, double valorUnitario, double valorAgregado, int edadMinima, int numProveedor) {
        super(codigo, marca, valorUnitario, valorAgregado, edadMinima, numProveedor);
    }
    public double valorFinal(double valorUnitario, double vAdicional){
        return valorUnitario + 2*vAdicional;
    }
    
    @Override
    public int compare(JuegueteElectrico e1, JuegueteElectrico e2){
        double valor1 = e1.valorFinal(e1.getValorUnitario(), e1.getValorAgregado());
        double valor2 = e2.valorFinal(e2.getValorUnitario(), e2.getValorAgregado());
        return new Double(valor1).compareTo(valor2);
        /*
        if (e1.valorFinal(e1.getValorUnitario(), e1.getValorAgregado()) <  e2.valorFinal(e2.getValorUnitario(), e2.getValorAgregado())){
            return -1;
        }
        else if (e1.valorFinal(e1.getValorUnitario(), e1.getValorAgregado()) >  e2.valorFinal(e2.getValorUnitario(), e2.getValorAgregado())){
            return 1;
        }
        else
            return 0;
    }*/
}
}
