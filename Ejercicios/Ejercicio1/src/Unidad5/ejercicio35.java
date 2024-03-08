package Unidad5;

import java.util.Scanner;

public class ejercicio35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Solicitamos una altura: ");
        int alt = sc.nextInt();
        int retro = alt;
        sc.close();
        if (alt >= 3 && (alt%2)==1) {
            int lineas = 1, cont = 1;
            while (alt >= lineas) {
                for (int i = 1; i <= alt; i++) {
                    if (i==lineas || (cont == lineas && i == retro)) {
                        System.out.print("*");
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println("");
                lineas++;
                retro--;
                cont++;
            }
        } else {
            System.out.println("Esta altura no esta permitida");
        }
    }

}
