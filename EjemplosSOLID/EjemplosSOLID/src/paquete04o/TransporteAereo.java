/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author reroes
 */
public class TransporteAereo extends Transporte{
    private String AereolineaAvion;
 
    
    public void establecerCooperativaTransvia(String n){
        AereolineaAvion = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 90 + 0.5;
    }
}
