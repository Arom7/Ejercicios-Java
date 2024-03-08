/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad4.Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Introduzca un numero del 1 al 7");
        int diaSemana = consola.nextInt();
        String dia;
        switch (diaSemana){
            case 1:
                dia = "Lunes";
                break;
            case 2: 
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4: 
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7 :
                dia = "Domingo";
                break;
            default: 
                dia = "ese dia no existe";             
        }
        System.out.println("Dia " + diaSemana + ": " + dia);
    }    
}
