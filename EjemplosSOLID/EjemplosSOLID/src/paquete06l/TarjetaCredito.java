/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author utpl
 */
public class TarjetaCredito {

    private String nombre;
    private String numero;

    public TarjetaCredito(String n, String num) {
        nombre = n;
        numero = num;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNumero() {
        return numero;
    }

    public void establecerNumero(String num) {
        numero = num;
    }

}
