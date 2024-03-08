
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alan
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int sumaCadena = A.length() + B.length();
        System.out.println(sumaCadena);
        boolean orden = false;
        for (int i = 0; i < A.length() && i<B.length() && !orden ; i++) {
            if (Character.compare(A.charAt(i), B.charAt(i))>0) {
                orden = true;
            }
        }
        if (orden)
        System.out.println("Yes");
        else 
        System.out.println("No");
        System.out.println( Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
        
    }

}
