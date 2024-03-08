package Unidad5;

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce numero positivo: ");
        int num = sc.nextInt();
        int cont = 0, sumaImpar = 0, mayorPar = 0; 
        while (num>0){
            if ((num%2)==0){
                if (num > mayorPar ){
                    mayorPar = num;
                }
            }else{
                sumaImpar+=num;
            }
            cont++;
            System.out.println("Introduce numero positivo:");
            num = sc.nextInt();
        }
        System.out.println("La cantidad total de numeros ingresados es: " + cont );
        System.out.println("El numero mayor par es: " + mayorPar);
        System.out.println("La suma de numeros impares es: " + sumaImpar);
    }
}
