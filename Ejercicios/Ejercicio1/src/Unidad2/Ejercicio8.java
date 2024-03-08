/*
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación
 * de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 */
package Unidad2;

/**
 *
 * @author Alan
 */
public class Ejercicio8 {

    public static void main(String[] args) {
       char caracter1 = 'a'; 
       char caracter2 = 'b';
       char caracter3 = 'c';
       char caracter4 = 'd';
       char caracter5 = 'e';
       String cadena; //cadena vacia funciona como truco para unir caracteres
       //porque si los colocamos como caracter1 + caracter2 + caracter3 + caracter4 + caracter5 
       //nos da la suma de todos los codigos ASCII 
        cadena = "" + caracter1 + caracter2 + caracter3 + caracter4 + caracter5;//truco para unir caracteres
       // cadena = "Union:" + caracter1 + caracter2 + caracter3 + caracter4 + caracter5;
        System.out.println(cadena);
    }
    
}
