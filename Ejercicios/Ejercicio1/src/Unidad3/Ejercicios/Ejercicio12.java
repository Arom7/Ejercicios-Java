/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 */
package Unidad3.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca la nota de su primer examen: ");
        double notaPP = s.nextDouble() * 0.4;
        System.out.print("Introduzca la nota que quiere sacar: ");
        double notaDeseo = s.nextDouble();
        double notaNecesitada = (notaDeseo - notaPP)/0.6;
        System.out.println("Para tener un " + notaDeseo + " en el trimestre necesitas sacar un " + notaNecesitada +" en el segundo examen.");
    }
    
}
