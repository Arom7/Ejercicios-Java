package Unidad5;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        System.out.print("Ingresar un numero n:");
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int cifras = 0;
        while (n>0){
            n = n/10;
            cifras++; 
        }
        System.out.println("El numero tiene: " + cifras + " cifras");
    }
}
