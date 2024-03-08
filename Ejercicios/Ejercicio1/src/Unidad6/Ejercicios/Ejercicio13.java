
package Unidad6.Ejercicios;

/**
 *
 * @author Alan
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        int []cad = new int [100];
        int n,pos=0,menor=500;
        //Generar numeros dentro de 0 a 500
        for(int i = 0; i<100; i++){
            n = (int)((Math.random()*10 + Math.random()*10 + Math.random()*10)*Math.random()*50);
            if (n<500)
                cad[i] = n;
            else 
                i--;
        }
        for(int i = 0; i<100; i++){
            System.out.print(cad[i] + " ");
            if (menor>cad[i]){
                menor = cad[i];
                pos = i;
            }
        }
        System.out.println("");
        for(int i = 0; i<100; i++){
            if (pos == i)
                System.out.print("**"+cad[i]+"** ");
            else 
                System.out.print(cad[i] + " ");
        }
        
        
    }
    
}
