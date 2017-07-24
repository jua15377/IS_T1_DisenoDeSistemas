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
        ControlJugueteria miControl = new ControlJugueteria();
        miControl.leerElectricos();
        miControl.sortElectricos();
        miControl.getLosJuguetes();
        
    }
}
