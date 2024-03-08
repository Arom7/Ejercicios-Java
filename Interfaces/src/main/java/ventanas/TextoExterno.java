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
public class TextoExterno extends JFrame implements ActionListener{
   
    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;
    
    public TextoExterno(){
    setLayout(null);
    label1 = new JLabel("Usuario");
    label1.setBounds(10, 10, 100, 30);
    add(label1);
    
    textfield1 = new JTextField();
    textfield1.setBounds(120,17,150,20);
    add(textfield1);
    
    boton1 = new JButton("Aceptar");
    boton1.setBounds(10,80,100,30);
    add(boton1);
    boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
        String texto = textfield1.getText(); // con esto almacenamos lo que se encuentre en 
        //el textofield1 y lo guarde en la variable texto
        setTitle(texto);//con esto colocamos o modificamos el titulo 
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextoExterno textoEx = new TextoExterno();
        textoEx.setBounds(0,0,300,200);
        textoEx.setVisible(true);
        textoEx.setResizable(false);
        textoEx.setLocationRelativeTo(null);
    
    }
    
}
