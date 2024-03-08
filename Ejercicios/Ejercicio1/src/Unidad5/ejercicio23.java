
package Unidad5;

import java.util.Scanner;

public class ejercicio23 {

    public static void main(String[] args) {
       int cont = 0 , suma = 0, media = 0, cant = 10000;
       Scanner sc = new Scanner (System.in);
       System.out.println("Ingrese numeros hasta que la suma no supere 10000: ");
       int num = sc.nextInt();
       while(suma <= cant ){
           suma = suma + num;
           cant = cant - num;
           cont++;
           System.out.println("Ingrese otro valor:");
           num = sc.nextInt();
       }
       media = suma / cont;
        System.out.println("La cantidad de numeros ingresados es: " + cont);
        System.out.println("La suma total es de: " + suma);
        System.out.println("La media es: " + media);
    }
    
}
