
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
// comentario simple
/*
espacio para comentar un sin fin de lineas
 */
public class HolaMundo {

    public static void main(String args[]) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        //modificamos el valor de la cadena
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var -> Inferencia de tipos en Java 
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva cadena";
        System.out.println(miVariableCadena2);

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;

        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); // se realiza la suma de numeros
        System.out.println(i + j + usuario); // concatenacion -> se realiza 
        //izquierda a derecha 
        System.out.println(usuario + i + j);// si primero el compilador
        //encuentra una cadena, lo demas lo concatena
        System.out.println(usuario + (i + j)); //modificacion de prioridad
        //primero la suma y luego concatena
        //el uso de parentesis modifica la prioridad en la evaluacion
        
        var nombre = "Karla";
        
        System.out.println("Nueva linea:\n" + nombre); // el \n que es el 
        //caracter para generar una nueva linea
        System.out.println("Tabulador:\t" + nombre); // caracter de tabulador
        System.out.println("Retroceso:\b" + nombre); //retrocede una posicion a una
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        System.out.println("Escribe tu nombre:");
        //permite leer informacion de la consola (clase Scanner)
        Scanner consola = new Scanner (System.in);
        var usuario2 = consola.nextLine(); //Detiene la ejecucion de 
        //nuestro programa hasta ingresar un dato
        System.out.println("usuario = " + usuario2);
        System.out.println("Escribe el titulo:");
        var titulo1 = consola.nextLine();
        System.out.println("Resultado: " + titulo1 + " " + usuario2);
        
// En el momento de imprimir la variable, si a este no se le asigno un 
// valor a la variable, el compilador manda el error
    
       /*
       Se solicita incluir la siguiente informacion de un libro 
       Titulo
       Autor
       imprimir la informacion en el siguiente formato 
       Proporciona el titulo:
       Proporciona el autor:
       <Titulo> fue escrito por <autor>
        */
       
       Scanner lectura = new Scanner (System.in);
       System.out.println("Proporciona el autor:");
       var autor = lectura.nextLine();
       System.out.println("Proporciona el titulo:");
       var titulo3 = lectura.nextLine();
       System.out.println(titulo3+ " fue escrito por " + autor);
    }
}
