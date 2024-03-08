/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import Matematicas.Funciones;
import java.util.Scanner;
/**
 *
 * @author Alan
 */
public class Ejercicio114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese un numero: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.print("El numero que ingreso ");
        boolean res = Matematicas.Funciones.esCapicua(numero);
        if (res)
            System.out.println("es capicua");
        else
            System.out.println("no es capicua");
    }
    
}
