package Unidad5;

import java.util.Scanner;

public class ejercicio36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero positivo: ");
        int num = sc.nextInt();
        int copia = num, dig = 0,num1 = num;
        boolean capicua = true;
        sc.close();
        while (copia > 0) {
            copia = copia / 10;
            dig++;
        }
        
        int divisor = (int) Math.pow(10.0, dig - 1);
        
        while (num > 0) {
            int digInicial = num1 / divisor;
            int digFinal = num % 10;
            if (digInicial != digFinal) {
                capicua = false;
            }
            num1 = num1 % divisor;
            num = num / 10;
            divisor = divisor / 10;
        }
        if (capicua)
            System.out.println("El numero es capicua");
        else
            System.out.println("El numero no es capicua");
    }
}
