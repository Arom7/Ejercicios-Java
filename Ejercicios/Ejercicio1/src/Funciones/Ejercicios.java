/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author Alan
 */
public class Ejercicios {

    //Ejercicio 35
    public static int[] pavotes(int n) {
        int cantDigitos = contarDigitos(n);
        int divisor = (int) (Math.pow(10, cantDigitos - 1));
        int[] digitos = new int[cantDigitos];
        for (int i = 0; i < cantDigitos; i++) {
            digitos[i] = n / divisor;
            n = n % divisor;
            divisor = divisor / 10;
        }
        return digitos;
    }

    private static int contarDigitos(int n) {
        int digitos = 0;
        while (n > 0) {
            digitos++;
            n = n / 10;
        }
        return digitos;
    }

    //Ejercicio 36
    public static int[] filtraPrimos(int x[]) {
        boolean analisis = true;
        int pos = 0;
        int[] numerosPrimos = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 2; j < x[i]; j++) {
                if (x[i] % j == 0) {
                    analisis = false;
                }
            }
            if (analisis) {
                numerosPrimos[i] = x[i];
            }
        }
        return numerosPrimos;
    }

    //Ejercicio 39 -> usamos lo del ejercicio 35
    //Ejercicio 41
    public static void linea(char caracter, int repeticiones) {
        while (repeticiones > 0) {
            for (int i = repeticiones; i > 0; i--) {
                System.out.print(caracter);
            }
            System.out.println("");
            repeticiones--;
        }
    }
    
    //Ejercicio 42
    public static void borrar (char caracter, int repeticiones){
        
    
    }
}
