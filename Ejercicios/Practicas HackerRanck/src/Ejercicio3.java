
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
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (A.length()<51){
            String B = "";
            for (int i = A.length() - 1  ; i>=0 ; i--){
                B = B + A.charAt(i);
            }
            System.out.println(B);
            if (A.equals(B)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
    }
    
}
