package Unidad6.Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generar array con 10 numeros
        int[] copia = new int[10];
        int[] numeros = new int[10];
        int numero, posicion = 0;

        for (int i = 0; i < 10; i++) {
            int num = (int) ((Math.random() * 10 + Math.random() * 10) * Math.random() * 10);
            if (num <= 100 && num >= 0) {
                numeros[i] = num;
            } else {
                i = i - 1;
            }
        }
        //Mostramos los numeros que tenemos
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        //Pedimos numero al usuario
        boolean continuar = true;
        while (continuar) {
            System.out.print("\nIngrese un numero por favor entero: ");
            Scanner sc = new Scanner(System.in);
            numero = Integer.parseInt(sc.nextLine());
            boolean iguales = false;
            for (int i = 0; i < 10 && !iguales; i++) {
                if (numero == numeros[i]) {
                    iguales = true;
                    continuar = false;
                    posicion = i;
                    System.out.println("El numero ingresado se encuentra en la cadena.");
                    for (int j = 0; j < 10; j++) {
                        System.out.print(numeros[j] + " ");
                    }
                }
            }
        }
        System.out.println("");
        int aux, pos , mover = 10 - posicion;
        for (int i = 0; i < 10 ; i++) {
            if (mover + i > 9)
                pos = i+mover-10;
            else
                pos = i+mover;
        
            copia[pos] = numeros [i];
        }
        
        for (int i = 0; i < 10 ; i++) {
            System.out.print( copia[i] +" ");
        }
    }
}
