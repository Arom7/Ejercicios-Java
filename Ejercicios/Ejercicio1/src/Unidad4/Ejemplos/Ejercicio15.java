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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca un numero: ");
        Scanner consola = new Scanner (System.in);
        int numero = consola.nextInt();
        if ((numero%2)==0){
            if ((numero%5)==0){
                System.out.println("El numero ingresado es divisible entre 5 y es par");
            }else {
                System.out.println("El numero ingresado es par");
            }
        }
        else if ((numero%5)==0){
            System.out.println("El numero ingresado solo es divisible entre 5");}
        else {
            System.out.println("El numero no es divisible entre 5 ni par");
        }
    }
    
}
