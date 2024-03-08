/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import javax.swing.*;
/**
 *
 * @author Alan
 */
public class ScroollPane extends JFrame{//funcion tanto para la derecha como la izquierda
    
    private JTextField textfield1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    
    public ScroollPane(){
    setLayout(null);
    textfield1 = new JTextField(); //esta vacio no queremos que tenga texto 
    textfield1.setBounds(10,10,200,30);
    add(textfield1);
    
    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1); // queremos que el texto de texarea1 este 
    //dentro de scroll para poder recorrerlo 
    scrollpane1.setBounds(10,50,400,300);
    add(scrollpane1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScroollPane nueva = new ScroollPane();
        nueva.setBounds (0,0,540,400);
        nueva.setVisible(true);
        nueva.setResizable(false); //el usuario no modifica 
        nueva.setLocationRelativeTo(null);
    }
    
}
