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
public class Proceso1 extends Thread{
    //primera forma -> heredamos de una clase que Java nos pone a disposicion
    @Override
    public void run(){//metodo run definido 
        for (int i = 0; i<=5; i++){
            System.out.println("Proceso 1");
        }
    }      
}
