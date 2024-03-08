package Unidad5;

import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introducir altura: ");
        int cant = s.nextInt();
        System.out.println("Introducir caracter a repetir: ");
        char c = s.next().charAt(0);
        s.close();
        int lineas = 1;
        while (cant >= lineas) {
            //otorga los espacios en blanco
            for (int blanco = 1; blanco <= cant - lineas ; blanco ++ ){
                System.out.print(" ");
            }
            
            for (int i = 1; i<=(lineas*2)-1;i++ ) {
                System.out.print(c);
            }
            System.out.println(" ");
            lineas++;   
        }
    }
}
