/*
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
package Unidad2;

/**
 * @author Alan
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x = 144;
       int y = 999;
       int suma = x+y;
       int resta = x-y;
       int multiplicacion = x*y;
       double division = ((double)x / (double)y);
        System.out.println("Valor de x = " + x);
        System.out.println("Valor de y = " + y);
        System.out.println("Valor de suma = " + suma);
        System.out.println("Valor de resta = " + resta);
        System.out.println("Valor de multiplicacion = " + multiplicacion);
        System.out.println("Valor de division = " + division);
    }
    
}
