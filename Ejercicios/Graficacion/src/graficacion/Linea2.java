/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Linea2 extends JPanel {
    private int x0 = 350,y0 = 250,x1 = 100 ,y1 = 10 ,aux;//aux saber si es el primer punto 
      //Color color;

       @Override
    public void paint(Graphics g) {
        super.paint(g);
        // algoritmo dda linea 
        //g.setColor(color.black);//por defecto es negro
       float Xinc,Yinc,x,y,delta;
       int i;
       if(Math.abs(x1-x0)>=Math.abs(y1-y0)){
          delta=Math.abs(x1-x0);
       }else{
          delta=Math.abs(y1-y0);
       }
       Xinc=(x1-x0)/delta;//el valor a aumentar en x
       Yinc=(y1-y0)/delta;//el valor a aumentar en y
       
       x=(float)x0;
       y=(float)y0;

       i=0;
       while(i<=delta){
          //setPixel(roundf(x),roundf(y));
          x=x+Xinc;
          y=y+Yinc;
          i++;
          g.drawLine( Math.round(x),Math.round(y),Math.round(x), Math.round(y));
        }
    }

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }
    
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }
    
    public Linea2() {
        this.aux=1;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>                        

    private void formMousePressed(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
         if (aux==2){
            x1=evt.getX();//punto mouse presionado
            y1=evt.getY();
            aux=0;
            //repaint();//pintar
         }
       if (aux==1){
            x0=evt.getX();
            y0=evt.getY();
       }
        aux++;
        //Grafica.actualizarPuntos(); //mostrar datos de los jlabel 
    }                                 
    
    public static void main(String[] args) {
        Linea l1 = new Linea();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujo Algoritmo DDA");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(500, 500);

        ventana.add(l1);
        ventana.setVisible(true);
    }
    // Variables declaration - do not modify                     
    // End of variables declaration                   
}

