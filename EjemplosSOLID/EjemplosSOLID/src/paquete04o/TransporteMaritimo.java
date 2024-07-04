/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author reroes
 */
public class TransporteMaritimo extends Transporte{
    private String coopAguita;
 
    
    public void establecerCooperativaCoopAguita(String n){
        coopAguita = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 50 + 0.8;
    }
}
