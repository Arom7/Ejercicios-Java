package Unidad6.Ejercicios;

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
       Scanner sc = new Scanner (System.in);
       int [] cad = new int [15];
       int [] copia = new int [15];
        //ingresa los 15 valores
       for (int i = 0 ; i < 15 ; i++){
           System.out.print("Ingrese un numero: ");
           cad[i] = Integer.parseInt(sc.nextLine());
       }
       
       for (int i = 0 ; i<15 ; i++){
           if (i == 14)
               copia[i] = cad[0];
           else
               copia[i] = cad[i+1];           
       }
       
       for (int i = 0 ; i<15 ; i++){
           System.out.print(cad[i] + " ");  
       } 
        System.out.println("");
       for (int i = 0 ; i<15 ; i++){
           System.out.print(copia[i] + " " );  
       } 
       sc.close();
    }
    
}
