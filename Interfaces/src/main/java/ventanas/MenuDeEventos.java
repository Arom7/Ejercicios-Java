/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Alan
 */
public class MenuDeEventos extends JFrame implements ActionListener {
    
    private JMenuBar menubar;   //la barra de pestanias -> solo es una 
    private JMenu menu1;
    private JMenuItem item1,item2,item3;
    
    public MenuDeEventos(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar); // no es necesario utilizar dimensiones
        
        menu1 = new JMenu ("Opciones");
        menubar.add(menu1);
        
        item1 = new JMenuItem("Rojo");
        item1.addActionListener(this);
        menu1.add(item1); //aniadimos al menu nuestro primer item
        
        item2 = new JMenuItem("Verde");
        item2.addActionListener(this);
        menu1.add(item2);
        
        item3 = new JMenuItem("Azul");
        item3.addActionListener(this);
        menu1.add(item3);
    
    }
    
    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane(); //en el programa tendremos un contenedor
        //que cambie y se adapte a la interfaz grafica con el metodo 
        //.getContentPane();  
        if (e.getSource() == item1){
         fondo.setBackground(new Color(255,0,0));  //modificamos a un nuevo color 
        }
        if (e.getSource() == item2){
         fondo.setBackground(new Color(0,255,0));
        }
        if (e.getSource() == item3){
         fondo.setBackground(new Color(0,0,255));
        }            
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuDeEventos evento = new MenuDeEventos();
        evento.setBounds(0,0,400,300);
        evento.setVisible(true);
        evento.setLocationRelativeTo(null);
    }    
}
