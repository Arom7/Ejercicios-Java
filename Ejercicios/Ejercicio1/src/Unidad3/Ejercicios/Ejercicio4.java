/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
package Unidad3.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Introducir el primer numero: ");
        int num1 = s.nextInt();
        System.out.print("Introducir el segundo numero: ");
        int num2 = s.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int mul = num1 * num2;
        double div = num1 / num2;
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + mul);
        System.out.println("La division de los numeros es: " + div);
    }

}
