package Unidad4.Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca solo la hora:");
        int hora = s.nextInt();
        if (hora >= 6 && hora < 12) {
            System.out.println("Buenos dias");
        } else {
            if (hora >= 12 && hora < 20) {
                System.out.println("Buenas tardes");
            } else {
                if (hora >= 20 && hora <= 5) {
                    System.out.println("Buenas noches");
                } else {
                    System.out.println("el valor introducido no se encuentra en los rangos");
                }
            }
        }
    }

}
