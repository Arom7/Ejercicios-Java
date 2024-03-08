package Unidad5;

import java.util.Scanner;
public class ejercicio12 {

    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de numeros que desea visualizar con fibonacci:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        n = n-2;
        int aux;
        for (int i = 0 ; i<n ; i++){
            aux = b;
            b = a + b;  
            a = aux;
            System.out.println(b);
        }   
    }  
}
