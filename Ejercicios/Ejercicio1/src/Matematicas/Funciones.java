
package Matematicas;

/**
 *
 * @author Alan
 */
public class Funciones {
    public static boolean esCapicua( int n ){
        int invertido = 0, respaldo = n;
        while (n > 0){
            if (n < 9)
                invertido = (invertido + n%10);
            else
                invertido = (invertido + n%10)*10;
            n = n/10;
        }
        return invertido == respaldo;
    }
    
    public static boolean esPrimo (int n){
        for (int i = 2 ; i<n ; i++){
            if (i%n == 0)
                return false;
        }
        return true;
    }
}
