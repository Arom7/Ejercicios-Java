
/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 */
package Unidad3.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca la cantidad de horas trabajadas: ");
        int sueldoSemanal = s.nextInt() * 12;
        System.out.println("El sueldo semanal del empleado es de: " + sueldoSemanal  + "$");
    }
    
}
