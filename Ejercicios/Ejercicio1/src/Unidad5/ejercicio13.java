
package Unidad5;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese 10 numeros positivos: ");
        int cont = 0, contP = 0, contNe = 0, contN = 0;
        while (cont<10){
            int num = sc.nextInt();
            if (num>0){
                contP++;
            }
            else if (num < 0 ){
                contNe++;
            } else {
                contN++;
            }
            cont++;
        }
        System.out.println("La cantidad de numeros positivos es: " + contP);
        System.out.println("La cantidad de numeros negativos es: " + contNe);
        System.out.println("La cantidad de numeros neutros es: " + contN);
    }
    
}
