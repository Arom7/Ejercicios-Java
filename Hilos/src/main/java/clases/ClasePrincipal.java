/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Alan
 */
public class ClasePrincipal {
   
    public static void main(String[] args) {
    /*
        for (int i = 0; i<=5; i++){
            System.out.println("Proceso 1");
        }
        System.out.println("");
        for (int i = 0; i<=5; i++){
            System.out.println("Proceso 2");
        }
    }
    */
    Proceso1 hilo1 = new Proceso1();//creacion de instancia para crear un hilo
    Proceso1 hilo3 = new Proceso1();
    Thread hilo2 = new Thread(new Proceso2());//considerar que el parametro funciona donde 
    //se quiere aplicar
    
    hilo1.start();
    hilo2.start();
    hilo3.start();
    /*
    Para que los hilos trabajen de manera simultanea debemos instaciar nuestros objetos 
    todos los que lleguemos a utilizar.
    No es necesario crear una clase por cada hilo, si queremos que el proceso
    se realize 2 veces de manera simultanea, lo unico es hacer una segunda 
    instancia 
    */
    }
}
