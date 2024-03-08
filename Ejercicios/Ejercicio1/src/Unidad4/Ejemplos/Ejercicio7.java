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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Ingrese las tres notas");
        int nota1 = consola.nextInt();
        int nota2 = consola.nextInt();
        int nota3 = consola.nextInt();
        int media = (nota1 + nota2 + nota3)/3;
        System.out.println("La media de las tres notas ingresadas es de: " + media);
    }
    
}
