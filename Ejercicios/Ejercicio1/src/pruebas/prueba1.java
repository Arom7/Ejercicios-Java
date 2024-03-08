/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;
import Funciones.Ejercicios;

/**
 *
 * @author Alan
 */
public class prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio 35
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un valor para las funciones: ");
        int n = Integer.parseInt(sc.nextLine()); 
        int [] digitos =  Funciones.Ejercicios.pavotes(n);
        for(int i = 0 ; i < digitos.length ; i++){
            for (int j = 0; j<digitos[i] ; j++){
                System.out.print("|");
            }
            if (i < digitos.length -1)
                System.out.print("-");
        }
         */

 /*Ejercicio 36 
       Scanner sc = new Scanner (System.in);
       System.out.print("Ingrese la longitud del arreglo : ");
       int longitud = Integer.parseInt(sc.nextLine());
       int [] numeros = new int [longitud] , copia = new int [longitud];
       System.out.println("Ingrese uno por uno los valores que utilizara para realizar el analisis de numeros primos: ");
       for (int i = 0 ; i<longitud ; i++ ){
           numeros[i] = Integer.parseInt(sc.nextLine());
       }
       copia = Funciones.Ejercicios.filtraPrimos(numeros);
       for (int i = 0 ; i<longitud ; i++ ){
            if (copia[i]!=0)
                System.out.println( copia[i] + " ");
       }
         */
 /*Ejercicio 39
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor para las funciones: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] digitos = Funciones.Ejercicios.pavotes(n);
        for (int i = 0; i < digitos.length; i++) {
            if (i != 0 && i != digitos.length){
                System.out.print(",");   
            }
            switch (digitos[i]) {
                case 1:
                    System.out.print(" uno");
                    break;
                case 2:
                    System.out.print(" dos");
                    break;
                case 3:
                    System.out.print(" tres");
                    break;
                case 4:
                    System.out.print(" cuatro");
                    break;
                case 5:
                    System.out.print(" cinco");
                    break;
                case 6:
                    System.out.print(" seis");
                    break;
                case 7:
                    System.out.print(" siete");
                    break;
                case 8:
                    System.out.print(" ocho");
                    break;
                case 9:
                    System.out.print(" nueve");
                    break;
                case 0:
                    System.out.print(" cero");
                    break;
                default:
                    System.out.print("");
            }
        }     
    */
    
    /*  Ejercicio 41
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        int repeticiones = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el caracter a repetir");
        char caracter = sc.nextLine().charAt(0);
        Funciones.Ejercicios.linea(caracter, repeticiones);
    */   
    
        //Ejercicio 42
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        int repeticiones = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el caracter a repetir");
        char caracter = sc.nextLine().charAt(0);
        Funciones.Ejercicios.linea(caracter, repeticiones);
    }
}
