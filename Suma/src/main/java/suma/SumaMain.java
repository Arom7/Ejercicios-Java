/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;
/**
 *
 * @author Alan
 */
public class SumaMain {
    public static void main (String args[]){
    Scanner entrada = new Scanner (System.in);
        System.out.println("Dame le primer valor: ");
        int valorUno = entrada.nextInt();
        System.out.println("Dame el segundo valor: ");
        int valorDos = entrada.nextInt();
        Suma valores = new Suma (valorUno,valorDos);
        valores.imprimir();
    }
}
