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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Ingrese su hora actual: ");
        int hora = consola.nextInt();
        System.out.println("Ingrese los minutos actuales: ");
        int minutos = consola.nextInt();
        int segundosFaltantes = 0;
        if (minutos == 59){
        segundosFaltantes += 60;
        }
        else {
        segundosFaltantes = (60-minutos) * 60;
        }
        
        if (hora != 0){
        segundosFaltantes += (24-hora) * 3600;
        }
        System.out.println("Los segundos faltantes son: " + segundosFaltantes);
    }
    
}
