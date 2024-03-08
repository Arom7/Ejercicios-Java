
package Unidad5;

import java.util.Scanner;

public class ejercicio24 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introducir altura: ");
        int cant = s.nextInt();
        s.close();
        int lineas = 1, j = 1; 
        while (cant >= lineas) {
            //otorga los espacios en blanco
            for (int blanco = 1; blanco <= cant - lineas ; blanco ++ ){
                System.out.print(" ");
            }
            for (int i = 1; i<=(lineas*2)-1;i++ ) {
                if (i<lineas){
                System.out.print(j);
                j++;
                }else{
                System.out.print(j);
                j--;
                }
            }
            System.out.println(" ");
            lineas++; 
            j=1;
        }
    }
    
}
