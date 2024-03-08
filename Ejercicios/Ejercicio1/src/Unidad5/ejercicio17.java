package Unidad5;

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int n = s.nextInt();
        int cont = 0;
        int sumaCompleta = 0;
        if (n > 0) {
            while (cont <= 99) {
                sumaCompleta = sumaCompleta + n;
                cont++;
                n++;
            }
        }
        System.out.println("La suma de los 100 numeros siguientes es: " + sumaCompleta);
    }

}
