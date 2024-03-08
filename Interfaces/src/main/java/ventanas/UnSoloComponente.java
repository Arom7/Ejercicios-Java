/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author Alan
 */
public class UnSoloComponente extends JFrame implements ChangeListener {
    private JRadioButton radio1,radio2,radio3;
    private ButtonGroup bg; //definimos a que grupo pertence nuestro 
    //JRadioButton
    
    public UnSoloComponente (){
    setLayout(null);
    bg = new ButtonGroup();
    radio1 = new JRadioButton("640*480");
    radio1.setBounds(10,20,100,30);
    radio1.addChangeListener(this);
    add(radio1);
    bg.add(radio1);  //aniadimos al grupo 
    
    radio2 = new JRadioButton("800*600");
    radio2.setBounds(10,70,100,30);
    radio2.addChangeListener(this);
    add(radio2);
    bg.add(radio2);
    
    radio3 = new JRadioButton("1024*768");
    radio3.setBounds(10,120,100,30);
    radio3.addChangeListener(this);
    add(radio3);
    bg.add(radio3); 
    }
    
    public void stateChanged (ChangeEvent e){
    if (radio1.isSelected()==true){
        setSize(640,480);
    }
    if(radio2.isSelected()==true){
        setSize(800,600);
    }
    if(radio3.isSelected()==true){
        setSize(1024,768);
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UnSoloComponente nuevo = new UnSoloComponente();
        nuevo.setBounds(0,0,350,230);
        nuevo.setVisible(true);
        nuevo.setResizable(false);
    }
    
}
