
package Unidad5;

import java.util.Scanner;

public class ejercicio28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese por favor un numero: ");
        int num = sc.nextInt();
        int factorial = 1;
        while (num>1){
            factorial = factorial * num;
            num--;
        }
        System.out.println("El factoria de " + num + " es igual a: " + factorial);
    }
}
