package Unidad5;
import java.util.Scanner;
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Ingrese la combinacion, considere que es de 4 cifras: ");
        int contrasenia = 1234;
        boolean correcto = false; 
        for (int i = 0; i<4 && !correcto ;i++){
            int comb = s.nextInt();
            if (comb == contrasenia){
                correcto = true;   
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }
            else {
                System.out.println("Lo siento, es no es nuestra combinacion, vuelva a intentarlo");
            }
        }
        if (!correcto)
        System.out.println("Lo sentimos mucho, termino sus intentos pruebe mas tarde");
    }  
}