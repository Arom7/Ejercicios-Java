/*
 * Las cadenas de caracteres con .next() estan delimitadas por espacio, si se quiere grabar mas cadenas se necesitas muchos .next().
 */
package Unidad3.Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce tu nombre y tu edad separados por un espacio: ");
        String nombre = s.next();
        String apellidoPaterno = s.next();
        String apellidoMaterno = s.next();
        int edad = s.nextInt();
        System.out.println("Tu nombre es " + nombre + " con apellido paterno "+ apellidoPaterno +" con apellido materno " + apellidoMaterno + " y tu edad es " + edad);
    }   
}
