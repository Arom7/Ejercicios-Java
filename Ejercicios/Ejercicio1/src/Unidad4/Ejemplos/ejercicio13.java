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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Ingrese tres numeros enteros");
        int num1 = consola.nextInt();
        int num2 = consola.nextInt();
        int num3 = consola.nextInt();
        if (num1 > num2){
            if (num1>num3){
                if (num2 > num3){
                    System.out.println("El orden es: " + num1 + " , " + num2 + " , " + num3);
                }
                else {
                    System.out.println("El orden es: " + num1 + " , " + num3 + " , " + num2 );
                }
            }
            else{
                System.out.println("El orden es: " + num3 + " , " + num1 + " , " + num2);
            }
        }
        else if (num2 > num3){
                if (num1 > num3){
                    System.out.println("El orden es: " + num2 + " , " + num1 + " 50, " + num3);}
                else {
                    System.out.println("El orden es: " + num2 + " , " + num3 + " , " + num1);}
        }
        else {
            System.out.println("El orden es: " + num3 + " , " + num2 + " , " + num1);}
        
                
    }
    
}
