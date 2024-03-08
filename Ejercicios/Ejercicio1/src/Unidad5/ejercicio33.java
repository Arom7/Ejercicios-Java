package Unidad5;

import java.util.Scanner;

public class ejercicio33 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introducir altura: ");
        int cant = s.nextInt();
        char c = '*';
        s.close();
        int lineas = 1;
        while (cant >= lineas) {
            for (int i = 1; i<=cant;i++ ) {
                    if (((i == 1 || i == cant) && cant == lineas) || ((i>1 && i<cant) && cant != lineas))
                        System.out.print(" ");
                    else   
                        System.out.print(c);           
            }
            System.out.println("");
            lineas++; 
        }
    }
}
