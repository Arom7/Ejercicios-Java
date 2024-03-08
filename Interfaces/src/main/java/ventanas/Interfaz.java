package ventanas;
import javax.swing.*;

public class Interfaz extends JFrame{

        private final JLabel label1; //unicamente esta clase tiene acceso a este atributo
        private final JLabel label2;
        
        public Interfaz (){
            setLayout(null); //ayuda a definir que los elementos que usen coordenadas para que 
            //se ubiquen donde queramos, el null permite que no haga nada a menos que hagamos la 
            //intruccion
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            label1 = new JLabel("InterfazGrafica.");
            label1.setBounds(10, 20, 300, 30);
            add(label1); //sin esto no se muestra nada 
            
            label2 = new JLabel ("Version1.0");
            label2.setBounds(10,100,100,30);
            add(label2);
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Interfaz formulario1 = new Interfaz();
      formulario1.setBounds(0,0,300,200);
      formulario1.setResizable(false); // el usuario no podra modificar el tamanio
      formulario1.setVisible(true);
      formulario1.setLocationRelativeTo(null); //con esto se muestra que la interfaz debe estar
      //al medio
    }
    
}
