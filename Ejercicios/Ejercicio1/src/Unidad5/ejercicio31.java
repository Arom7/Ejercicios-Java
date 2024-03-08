package Unidad5;

import java.util.Scanner;

public class ejercicio31 {

    public static void main(String[] args) {
        System.out.print("Ingrese la altura para armar la letra L: ");
        Scanner sc = new Scanner(System.in);
        int alt = sc.nextInt();
        int hor = (int) Math.round((alt) / 2);
        while (alt > 0) {
            if (alt == 1) {
                while (hor >= 0) {
                    System.out.print("* ");
                    hor--;
                }
            } else {
                System.out.println("*");
            }
            alt--;
        }
        sc.close();
        System.out.println("");
    }

}
