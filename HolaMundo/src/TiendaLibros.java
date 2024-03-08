
import java.util.Scanner;


public class TiendaLibros {

    public static void main(String[] args) {
        System.out.println("Proporciona el nombre:");
        var consola = new Scanner (System.in);
        String nombre = consola.nextLine();
        
        System.out.println("Proporciona el ID:");
        consola = new Scanner(System.in);
        int id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporciona el precio:");
        consola = new Scanner(System.in);
        double precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("Proporciona el envio gratuito:");
        consola = new Scanner(System.in);
        boolean envio = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println( nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envio);
        
    }
    
}
/* Una mejor solucion, el scanner se puede reutilizar
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
*/