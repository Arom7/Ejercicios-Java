/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inversodepalabras;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class InversoDePalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribre una palabra o frase:");
        palabra = entrada.nextLine();
        longitudPalabra = palabra.length();
        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra-1,longitudPalabra); 
         /*con la linea de arriba decimos que el caracter que esta entre longitudPalabra-1 y 
            longitudPalabra y lo guardamos en palabraInvertida
         */
         longitudPalabra--;
        }
        System.out.print("Palabra invertida: " + palabraInvertida);
    }
    
}
