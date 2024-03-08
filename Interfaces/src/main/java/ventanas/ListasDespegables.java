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
public class ListasDespegables extends JFrame implements ItemListener{
    
    private JComboBox combo1;
    
    public ListasDespegables (){
    setLayout (null);
    combo1  = new JComboBox();
    combo1.setBounds(10,10,80,20);
    add(combo1);
    
    combo1.addItem("rojo");
    combo1.addItem("verde");
    combo1.addItem("azul");
    combo1.addItem("amarillo");
    combo1.addItem("negro");
    combo1.addItemListener(this); //mas adelante se encontrara con un evento programadado 
    //para este componente
    //podemos anaidir multiples veces 
    }
    
    public void itemStateChanged (ItemEvent e){
        if(e.getSource() == combo1){
            String seleccion = combo1.getSelectedItem().toString();//para poder usar el texto
            //almacenado en combo1, lo que hacemos es, el item seleccionado como rojo
            //verda,azul,negro... cambiarlo a una cadena
            setTitle(seleccion);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListasDespegables despe = new ListasDespegables ();
        despe.setBounds(0, 0, 250, 200);
        despe.setVisible(true);
        despe.setResizable(false);
        despe.setLocationRelativeTo(null);
    }
    
}
