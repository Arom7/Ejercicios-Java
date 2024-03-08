/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
combinacion de componentes -> EN EL TEXTfield escribe cualquier texto y con un boton
limpiar y lo agrega al area. Consideremos que se guardan todos los textField que colocamos 
almacenado estas -> el texto agrega al final nuevo
 */
package ventanas;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Alan
 */
public class CombinacionTextos extends JFrame implements ActionListener {
    
    private JTextField textfield1;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    private JButton boton1;
    
    String texto =  "";
    
    public CombinacionTextos(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        
        
        boton1 = new JButton ("Agregar");
        boton1.setBounds(250,10,100,30);
        add(boton1);
        boton1.addActionListener(this);
        
        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane (textarea1);
        scrollpane1.setBounds(10, 50, 400, 300);
        add(scrollpane1);
    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource()==boton1){
            texto += textfield1.getText() + "\n";   //+=(esto funciona como un acumulador
                                                    //dentro de un espacio 
                                                    //de memoria) -> el \n da un salto 
                                                    //de linea
            textarea1.setText(texto);  //con esto colocamos nuestro texto 
            textfield1.setText("");  //con esto limpiamos nuestros textos 
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CombinacionTextos f = new CombinacionTextos();
        f.setBounds(0,0,540,400);
        f.setVisible(true);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
    }
    
}
