/*
 * 
 */
package Unidad3.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca el primer numero: ");
        int numero1 = s.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int numero2 = s.nextInt();
        int mul = numero1 * numero2;
        System.out.println("La multiplicacion de ambos numeros es: " + mul );
    }   
}
