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
public class MultiplesOpciones extends JFrame implements ChangeListener{
    //para manejar eventos con un JCheckBox necesitamos ChangeListener
    private JCheckBox check1,check2,check3;
    
    public MultiplesOpciones (){
    setLayout(null);
    check1 = new JCheckBox("Ingles");
    check1.setBounds(10, 10, 150, 30);
    check1.addChangeListener(this);
    add(check1);
    
    check2 = new JCheckBox("Frances");
    check2.setBounds(10, 50, 150, 30);
    check2.addChangeListener(this);
    add(check2);
    
    check3 = new JCheckBox("Aleman");
    check3.setBounds(10, 90, 150, 30);
    check3.addChangeListener(this);
    add(check3);
    }
    
    public void stateChanged (ChangeEvent e){
       String cad =""; //alojamos las cadenas de texto
       if (check1.isSelected()==true){
           cad = cad + "Ingles-";
       }
       if (check2.isSelected()==true){
           cad = cad + "Frances-";
       }
       if (check3.isSelected()==true){
           cad = cad + "Aleman-";
       }
       setTitle(cad);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MultiplesOpciones multi = new MultiplesOpciones();
        multi.setBounds(0,0,350,200);
        multi.setVisible(true);
        multi.setResizable(false);
        multi.setLocationRelativeTo(null);
    }
    
}
