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
public class Ejercicio8 {

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
        if (media < 51){
            System.out.println("Nota insuficiente");
        } 
        else if(media < 55){
            System.out.println("Nota suficiente");
        }
        else if (media < 70){
            System.out.println("Nota bien");
        }
        else if (media < 85) {
            System.out.println("Nota notable");
        }
        else if (media<=100){
            System.out.println("Nota sobresaliente");
        }
    }
    
}
