/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.*;  //para la parte de componentes
import javax.swing.event.*; //para poder darle un evento para nuestro JCheckBox
import java.awt.event.*; //darle un evento para nuestro boton

/**
 *
 * @author Alan
 */
public class BotonTerminoCondiciones extends JFrame implements ActionListener,ChangeListener {
//para un Checkbox necesitamos implementar ChangeListener
//para un boton ActionListener -> solucion colocar ambos serapados
//por una coma 

    private JLabel label1;
    private JCheckBox check1;
    private JButton boton1;

    public BotonTerminoCondiciones() {
        setLayout(null);
        label1 = new JLabel("Aceptar terminos y condiciones");
        label1.setBounds(10, 10, 400, 30);
        add(label1);
        check1 = new JCheckBox("Acepto");
        check1.setBounds(10, 50, 100, 30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 100, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false); //con esto habilitamos el boton durante nuestra 
        //interfaz, luego cuando se acepte se habilita

    }

    public void stateChanged(ChangeEvent e) {
        if (check1.isSelected() == true) { // si esta seleccionado.(sirve 
            //para preguntar si esta seleccionado)
            boton1.setEnabled(true);
        } else {
            boton1.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0); //cerrar la interfaz
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BotonTerminoCondiciones botonCon = new BotonTerminoCondiciones ();
        botonCon.setBounds(0,0,350,200);
        botonCon.setVisible(true);
        botonCon.setResizable(false);
        botonCon.setLocationRelativeTo(null);
    }
}