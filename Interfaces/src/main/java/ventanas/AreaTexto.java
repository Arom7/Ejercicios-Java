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
public class AreaTexto extends JFrame {
    private JTextField textfield1;
    private JTextArea textarea1;
    
    public AreaTexto(){
    setLayout(null);
    textfield1 = new JTextField();
    textfield1.setBounds(10,10,200,30);
    add(textfield1);
    
    textarea1 = new JTextArea();
    textarea1.setBounds(10,50,400,300);
    add(textarea1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AreaTexto area = new AreaTexto();
        area.setBounds (0,0,540,400);
        area.setVisible(true);
        area.setResizable(false);
        area.setLocationRelativeTo(null);
    }
    
}
