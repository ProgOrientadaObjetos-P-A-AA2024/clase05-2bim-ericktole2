/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Persona {

    private String nombre;
    private int edad;
    private Ciudad ciudad;

    public Persona(String n, int e, Ciudad c) {
        nombre = n;
        edad = e;
        ciudad = c;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEdad(int n) {
        edad = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

}
