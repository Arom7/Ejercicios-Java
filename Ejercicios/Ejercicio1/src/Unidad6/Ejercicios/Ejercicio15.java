package Unidad6.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generar mesas con personas entre 4 a 0 personas 
        int[] cad = new int[10];
        int num;
        for (int i = 0; i < 10; i++) {
            num = (int) (Math.random() * 10);
            if (num < 5 && num >= 0) {
                cad[i] = num;
            } else {
                i = i - 1;
            }
        }

        //imprimir valores 
        System.out.print("|Mesa n*  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | \n|Ocupacion|");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + cad[i] + " |");
        }

        Scanner sc = new Scanner(System.in);
        int numeroMesa,n = 0;
        boolean seguir = true;
        while (seguir) {
            System.out.print("\n|Mesa n*  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | \n|Ocupacion|");
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + cad[i] + " |");
            }
            System.out.print("\nCuantos son? (Introduzca -1 para salir del programa):");
            n = Integer.parseInt(sc.nextLine());
            if (n != -1) {
                boolean espacio = false;
                for (int i = 0; i < 10 && !espacio; i++) {
                    if ((cad[i] + n) <= 4) {
                        numeroMesa = i+1;
                        System.out.println("Por favor sientese en la mesa " + numeroMesa);
                        cad[i] = cad[i] + n;
                        espacio = true;
                    }
                }
                if (!espacio) {
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                }
            } else {
                System.out.println("Gracias. Hasta pronto.");
                seguir = false;
            }
        }
    }
}
