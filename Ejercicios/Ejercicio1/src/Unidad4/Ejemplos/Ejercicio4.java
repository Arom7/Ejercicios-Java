package Unidad4.Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("introduzca las horas trabajadas durante la semana:");
        int horas = s.nextInt();
        if (horas <= 40) {
            System.out.println("El sueldo semanal que le corresponde es de " + horas*12 + " euros");
        }
        else{
            int salario = 40*12 + (horas - 40)*16;
            System.out.println("El sueldo semanal que le corresponde es de " + salario + " euros");}

    }

}
