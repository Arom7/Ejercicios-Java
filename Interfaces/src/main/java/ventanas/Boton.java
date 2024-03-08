/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Alan
 */
public class Boton extends JFrame implements ActionListener { 
    //(implements ActionListener)
    //Al momento de hacer click en un boton, esta clase escuchara un evento dentro de JFrame
    private JButton boton1;
    public Boton (){
        setLayout(null); //manejo de coordenadas 
        boton1 = new JButton ("Cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1); //si esto no aparece 
        boton1.addActionListener(this);//este boton tendra un evento, con el this significara 
        //que estara a la espera
    }

    public void actionPerformed(ActionEvent e){ //guardamos en un espacio de memoria el evento
        // dentro de la variable e
        if (e.getSource()==boton1){ // el metodo getSource recupera el evento guardado en la 
            //variable e y lo compara en el boton 1 (boton que esperamos click) verificamos que 
            //boton usamos
            System.exit(0); //al momento de apretar el boton se cerrara
            
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boton boton = new Boton ();
        boton.setBounds(0,0,450,350);
        boton.setVisible(true);
        boton.setResizable(false); //permitimos que nuestro usuario modifique las dimensiones
        boton.setLocationRelativeTo(null);
    }
    
}
