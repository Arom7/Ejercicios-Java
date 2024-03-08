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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner consola = new Scanner (System.in);
       System.out.println("Ingrese la altura");
       int h = consola.nextInt();
       double tiempo = Math.sqrt((2*h)/9.81);
       System.out.println("El tiempo de caida es de: "  + tiempo);
    }
    
}
