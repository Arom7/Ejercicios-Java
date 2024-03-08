
package Unidad6.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[]cad = new int[8];
        for (int i = 0; i<8 ; i++){
            System.out.print("Ingresar numero: ");
            cad[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Ingresados todos los numeros.");
        for(int n : cad){
            if (n%2 == 0){
                System.out.println(n + " es par");
            }else{
                System.out.println(n + " es impar");
            }
        }
    }
    
}
