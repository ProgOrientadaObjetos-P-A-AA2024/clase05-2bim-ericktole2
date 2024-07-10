/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TarjetaCredito t1 = new TarjetaCredito ("VISA","11505785648");
        t1.establecerNombre("Visa");
        t1.establecerNumero("11505785648");
        // podemos establecer sus los datos de un objeto por medio de su 
        // constructor osea enviando directmente, como tambien llamar los 
        // metodos esablecer de cada tipo de dato 
        
        MayorEdad representante = new MayorEdad("José", t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\nNombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre(),
                representante.obtenerNombre(),representante.obtenerTarjeta());
        
    }
}
