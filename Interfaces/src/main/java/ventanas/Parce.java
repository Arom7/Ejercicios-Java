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
public class Parce extends JFrame implements ActionListener{
    
    private JTextField textfield1,textfield2;
    private JLabel label1, label2 ,label3 ;
    private JButton boton1;
    
    public Parce(){
        setLayout(null);
        label1 = new JLabel ("Valor 1: ");
        label1.setBounds(50,5,100,30);
        add(label1);
        
        label2 = new JLabel ("Valor 2: ");
        label2.setBounds(50,35,100,30);
        add(label2);
        
        label3 = new JLabel ("Resultado: ");
        label3.setBounds(120,80,100,30);
        add(label3);
        
        textfield1 = new JTextField();
        textfield1.setBounds(120,10,150,20);
        add(textfield1);
        
        textfield2 = new JTextField();
        textfield2.setBounds(120,40,150,20);
        add(textfield2);
        
        boton1 = new JButton ("Sumar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
     if (e.getSource() == boton1){
        int valor1 = 0, valor2 = 0, resultado = 0;
        valor1 = Integer.parseInt(textfield1.getText());//cuando usamos = asignamos
        valor2 = Integer.parseInt(textfield2.getText());  
        //metodo parceso que cambia de un dato string a uno entero;
        resultado = valor1 + valor2;
        
        label3.setText("Resultado: " + resultado); //concatenamos 
     }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Parce p = new Parce();
        p.setBounds (0,0,300,150);
        p.setVisible(true);
        p.setResizable(false);
        p.setLocationRelativeTo(null);
    }   
}
