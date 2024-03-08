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
public class Submenus extends JFrame implements ActionListener {
    
    private JMenuBar menubar;
    private JMenu menu1,menu2,menu3;
    private JMenuItem item1,item2,item3,item4;
    
    public Submenus(){
    setLayout (null);
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    
    menu1 = new JMenu("Opciones");
    menubar.add(menu1);
    
    menu2 = new JMenu("Tamanio de la ventana");
    menu1.add(menu2);
    
    menu3 = new JMenu("Color de fondo");
    menu1.add(menu3); //con esto ya generamos submenus 
    
    item1 = new JMenuItem ("300*200");
    menu2.add(item1);
    item1.addActionListener(this);
    
    item2 = new JMenuItem ("640*480");
    menu2.add(item2);
    item2.addActionListener(this);
    
    item3 = new JMenuItem ("Rojo");
    menu3.add(item3);
    item3.addActionListener(this);
    
    item4 = new JMenuItem ("Verde");
    menu3.add(item4);
    item4.addActionListener(this);
    }
    
    public void actionPerformed (ActionEvent  e){
        //forma diferente de cambiar el fondo de la interfaz grafica 
        if (e.getSource() == item1){
         setSize(300,200); //modifica el tamanio de la pantalla 
        }
        if (e.getSource() == item2){
         setSize(640,480);
        }
        if (e.getSource() == item3){
         getContentPane().setBackground(new Color (255,0,0)); //haga cambios directos 
         //en el fondo de la interfaz sacando primero los datos del panel y luego 
         //modificarlo 
        }
        if (e.getSource() == item4){
            getContentPane().setBackground(new Color (0,255,0));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Submenus nueva = new Submenus();
        nueva.setBounds (0,0,300,200);
        nueva.setVisible(true);
        nueva.setResizable(false); //el usuario no modifica 
        nueva.setLocationRelativeTo(null);
        
    }
    
}
