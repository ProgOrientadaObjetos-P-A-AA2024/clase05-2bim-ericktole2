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
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String

    public void establecerListaCiudadesEstudiantes() {
        
        String cadena = "";
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%s%s\n", cadena,
                    estudiantes.get(i).obtenerCiudad().obtenerNombre());
        }
       listaCiudadesEstudiantes = cadena;
    }

    public void establecerEdadMinima() {
        edadminima = 100;
        for (Persona e : estudiantes) {
            if (e.obtenerEdad() < edadminima) {
                edadminima = e.obtenerEdad();
            }
        }

    }

    public void establecerEdadMaxima() {
        edadmaxima = 0;
        for (Persona e : estudiantes) {
            if (e.obtenerEdad() > edadmaxima) {
                edadmaxima = e.obtenerEdad();
            }
        }

    }

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadena = String.format("Lista de Estudiantes");
        for (Persona e : estudiantes) {
            cadena = String.format("%s\n%s - %d anios", cadena, e.obtenerNombre(),
            e.obtenerEdad());
            
        }
        cadena = String.format("%s"
                + "\nEdad minima : %d"
                + "\nEdada Maxima : %d"
                + "\nPromedio de edades: %.2f"
                + "\nCiudades:\n %s",cadena,edadminima,edadmaxima
                ,promedioEdades,listaCiudadesEstudiantes);
        return cadena;
    }

}
