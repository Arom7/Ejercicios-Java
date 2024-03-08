/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */
package Unidad3.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
        System.out.print("Introduzca la cantidad que desea cambiar: ");
       double euros = s.nextDouble();
       double pesetas = euros * 166.386;
        System.out.println(euros + " euros es igual a " + pesetas + " pesetas");
    }
    
}
