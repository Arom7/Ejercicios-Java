/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;



/**
 *
 * @author Alan
 */
public class Suma {
    
    private int vUno,vDos,resultado;
    public Suma (int valorUno, int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    
    public void operacion(){
     resultado = vUno + vDos;
    }
    public void imprimir(){
     operacion();
     System.out.println("El resultado de la suma es: "+ resultado);
    }
}

