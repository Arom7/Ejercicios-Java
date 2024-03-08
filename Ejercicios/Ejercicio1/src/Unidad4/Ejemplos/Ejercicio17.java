/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad4.Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingresar un numero: ");
        Scanner consola = new Scanner (System.in);
        int numero = consola.nextInt();
        int cifra = numero%10;
        System.out.println("La ultima cifra es: " + cifra);
    }
    
}
