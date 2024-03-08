
package Unidad5;

import java.util.Scanner;

public class ejercicio32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Por favor, introduzca un numero positivo: " );
        long num = sc.nextLong();
        int sumaPares = 0;
        System.out.print("Digitos pares: ");
        while (num>0){
            int digito = (int)num % 10;
            if ((digito%2)==0){
                System.out.print( digito +" ");
                sumaPares = sumaPares+digito;       
            }
            num = num/10;
        }
        System.out.println("");
        System.out.println("Suma de digitos pares: " + sumaPares);
    }
    
}
