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
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese lo consumido, por favor: ");
        Scanner consola = new Scanner (System.in);
        String comida = consola.nextLine();
        if (comida.equals("palmera")){
            System.out.println("Su cuenta es de: 1.40$");
        }
        else if (comida.equals("donut")){
            System.out.println("Su cuenta es de: 1$");
        }
        else if (comida.equals("pitufo")){
            System.out.print("Estaba hecho con aceite o con tortilla");
            String respuesta = consola.nextLine();
            if (respuesta.equals("aceite")){
                System.out.println("Su cuenta es de: 1,20$");
            }
            else {
                System.out.println("Su cuenta es de: 1,60$");
            }
        }
        else {
            System.out.println("Eso no se encuentra en nuestro menu");
        }
        System.out.println("Algo para tomar?");
        String resp = consola.nextLine();
        if (resp.equals("zumo")){
            System.out.println("Su cuenta es de 1,50$");
        }
        else if (resp.equals("cafe")){
            System.out.println("Su cuenta es de 1,20$");
        }
    }
    
}
