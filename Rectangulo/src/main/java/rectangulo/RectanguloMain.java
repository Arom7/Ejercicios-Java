/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class RectanguloMain {
    public static void main (String [] args){
    Scanner entrada = new Scanner (System.in);
        System.out.println("Dame el valor de la base: ");
        int base = entrada.nextInt();
        System.out.println("Dame el valor de la altura: ");
        int altura = entrada.nextInt();
        
        Rectangulo mensajero = new Rectangulo(base, altura);
        mensajero.imprimir();
    }
}
