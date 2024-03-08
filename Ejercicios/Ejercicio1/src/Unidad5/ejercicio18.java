package Unidad5;
import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Ingresar el rango de los numeros: ");
        Scanner s = new Scanner (System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int menor,mayor;
        if (num1 > num2){
            menor = num2;
            mayor = num1;
        }
        else {
            menor = num1;
            mayor = num2;
        }
        while (menor <= mayor){
            System.out.println(menor);
            menor = menor + 7;
        }
    }
}