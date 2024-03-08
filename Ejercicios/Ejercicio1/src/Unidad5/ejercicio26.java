
package Unidad5;

import java.util.Scanner;

public class ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();
        System.out.print("Introduzca un digito: ");
        int dig = sc.nextInt();
        boolean encontrado = false;
        int contDig = 0 , copia = num; 
        while (copia > 0){
            copia = copia/10;
            contDig++;
        }
        int divisor = (int) Math.pow(10.0,(double)contDig-1);
        contDig = 0;
        while (num>0 && !encontrado){
            if ((num/divisor) == dig){
                encontrado = true;
            }
            num = num%divisor;
            divisor = divisor/10;
            contDig++;
        }
        if (encontrado)
            System.out.println("El digito se encuentra en la posicion: " + contDig);
        else 
            System.out.println("El digito no se encuentra en el numero ingresado");    ;
    }
    
}
