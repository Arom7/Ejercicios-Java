
package Unidad5;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        System.out.println("Introduce numeros y termina en uno negativo");
        Scanner sc = new Scanner (System.in);
        int cont = 0 , media = 0 ,num = sc.nextInt();
        while(num >= 0){
            media= media + num;
            cont++;
            num = sc.nextInt();
        }
        media = media/cont;
        System.out.println(media);
    }
    
}
