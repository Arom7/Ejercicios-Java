
package Unidad6.Ejercicios;

/**
 *
 * @author Alan
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]cad = new int [20]; 
        System.out.println("Generando cadena de numeros");
        for (int i = 0; i<20 ; i++){
            cad [i] = (int)(Math.random()*10);
            System.out.print(cad[i] + " ");
        }
        int aux,pos = 0;
        for(int i = 0; i<20 ; i++){
           if (cad[i]%2 == 0){
               aux = cad[pos];
               cad[pos]= cad[i];
               cad[i] = aux;
               pos++;
           }       
        }
        System.out.println("");
         for (int i = 0; i<20 ; i++){
            System.out.print(cad[i] + " ");
        }
    }
    
}
