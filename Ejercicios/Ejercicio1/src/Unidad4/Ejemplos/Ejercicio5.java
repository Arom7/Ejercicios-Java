package Unidad4.Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca el valor de a: ");
        double a = s.nextDouble();
        System.out.println("Ahora introduzca el valor de b: ");
        double b = s.nextDouble();
        if (a != 0) {
            if (b != 0) {
                double r = (b * -1) / a ;
                System.out.println("x = " + r);
            }
            else{
                System.out.println("x = 0");
            }
        } else {
            System.out.println("esa ecuacion no tiene solucion real");
        }
    }

}
