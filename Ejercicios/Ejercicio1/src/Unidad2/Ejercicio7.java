/*
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
 * mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
 * de Java (con un solo println) ¿es posible?
 * es posible
 */
package Unidad2;

/**
 *
 * @author Alan
 */
public class Ejercicio7 {

    public static void main(String[] args) {
       char caracter1 = 'a'; 
       char caracter2 = 'b';
       char caracter3 = 'c';
       char caracter4 = 'd';
       char caracter5 = 'e';
       String cadena1 = "Estas son ";
       String cadena2 = "las primeras ";
       String cadena3 = "letras del ";
       String cadena4 = "abecedario: ";
        System.out.println(cadena1 + cadena2 + cadena3 + cadena4 + caracter1 + caracter2 + caracter3 + caracter4 + caracter5);
    }
    
}
