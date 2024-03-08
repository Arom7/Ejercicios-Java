/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.hackerank;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class PracticasHackerank1 {

        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean orden = false; 
        int suma = A.length() + B.length();
        for (int i = 0; i< A.length() ; i++){
            if (A.charAt(i)>B.charAt(i))
            orden = true;
        }
        String cadenasUnidas = A + " " + B;
        
        if (orden == true)
        System.out.println ("Yes");
        else 
        System.out.println ("No");
        System.out.println(cadenasUnidas);
        
    }    
}
