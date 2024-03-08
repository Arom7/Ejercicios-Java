

package Unidad4.Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana:");
        String diaSemana = s.nextLine();
        switch(diaSemana){
            case "lunes":
                System.out.println("\nLa materia de primera hora es matematicas");
                break;
            case "martes":
                System.out.println("\nLa materia de primera hora es biologia");
                break;
            case "miercoles":
                System.out.println("\nLa materia de primera hora es educacion fisica");
                break;
            case "jueves":
                System.out.println("\nLa materia de primera hora es religion");
                break;
            case "viernes":
                System.out.println("\nLa materia de primera hora es musica");
                break;
            case "sabado":
                System.out.println("\nLa materia de primera hora es computacion");
                break;
            case "domingo":
                System.out.println("\nLa materia de primera hora es lenguaje");
                break;
            default:
                System.out.println("\nNo pertence a los dias de la semana");
        }
    }
    
}
