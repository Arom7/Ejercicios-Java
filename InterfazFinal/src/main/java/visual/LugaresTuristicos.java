import javax.swing.*;
import java.awt.*;

public class LugaresTuristicos extends JFrame {
    JPanel panel = new JPanel();

    public LugaresTuristicos() {
        setTitle("Lugares Turisticos");
        setBounds(500, 200, 1080, 800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiqueta();
        colocarListaDesplegable();
        colocarAreaDeTexto(); 
    }
    private void colocarPaneles() {
        panel.setBackground(new Color(32, 112, 193));
        panel.setLayout(null);
        this.getContentPane().add(panel);
        setVisible(true);
    }
    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("AGENCIA DE VIAJES", SwingConstants.LEFT);//crea la etiqueta
        panel.add(etiqueta);
        etiqueta.setBounds(10, 0, 500, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
        setVisible(true);
        //imagen1  
        //
        ImageIcon imagen1 = new ImageIcon("D:\\Imagenes\\Potosi.jpg","Potosi");
        JLabel foto1 = new JLabel();
        foto1.setBounds(80,180,250,150);
        foto1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(300,200,4)));
        setVisible(true);
        panel.add(foto1);
        //imagen2
        ImageIcon imagen2 = new ImageIcon("D:\\Imagenes\\Oruro.JPEG", "Oruro");
        JLabel foto2 = new JLabel();
        foto2.setBounds(80,370,250,150);
        foto2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(300,200,4)));
        panel.add(foto2);
        setVisible(true);
        //imagen3
        //ImageIcon imagen3 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Cochabamba/lugares.jpg");
        //JLabel foto3 = new JLabel();
        //foto1.setBounds(680,180,300,200);
        //foto1.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(300,200,4)));
        //panel.add(foto3);
    }
    private void colocarListaDesplegable(){
        String[] opciones = {"La Paz","Cochabamba","Santa Cruz","Oruro","Potosí","Chuquisaca","Tarija","Beni","Pando"};
        JComboBox lista = new JComboBox(opciones);
        lista.setBounds(430,100,200,30);
        lista.setSelectedItem("Cochabamba");
        lista.addItem("vuelos");
        panel.add(lista);
        setVisible(true);
    }
    private void colocarAreaDeTexto() {
        JTextArea contactanos = new JTextArea();
        contactanos.setBounds(20, 610, 300, 300);
        contactanos.setBackground(null);
        contactanos.setForeground(Color.white);
        contactanos.setText("Contáctanos: \nAv. Ayacucho entre Colombia y Ecuador \n+591 62615493 \n4 4446666 \nCochabamba-Bolivia");
        panel.add(contactanos);
        setVisible(true);
        //Descripcion
        JTextArea descripcion = new JTextArea();
        descripcion.setBounds(350, 180, 300, 300);
        descripcion.setBackground(null);
        descripcion.setForeground(Color.white);
        descripcion.setText("Potosi \nLa ciudad sur de Bolivia reconocida por su inmensa \nriqueza del Cerro Rico nos ofrece: "
                + "                 \n");
        panel.add(descripcion);
        
        JTextArea descripcionOruro = new JTextArea();
        descripcionOruro.setBounds(350, 340, 450, 450);
        descripcionOruro.setBackground(null);
        descripcionOruro.setForeground(Color.white);
        descripcionOruro.setText("Oruro esta maravillosa ciudad que llega a ofrecernos:"
                + "               \nel El Carnaval, en devocion de la Virgen del Socavon"
                + "               \nParque Nacional Sajama con su impresionante belleza escenica"
                + "               \nLago Poopo excelente para la practica de caza y pesca"
                + "               \nSalar de Coipasa el segundo salar mas grande despues del salar de Uyuni"
                + "               \nPinturas Rupestres de Cala Cala caracterizada por presencio de rocas pictograficas");
        panel.add(descripcionOruro);
        setVisible(true);
    }
}
