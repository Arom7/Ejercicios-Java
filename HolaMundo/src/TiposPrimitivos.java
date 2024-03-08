
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
public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
            tipos primitivos enteros: byte, short, char, int, long
        */
        byte numeroByte = (byte)129; // de esta manera obligamos a que
        //nuestro valor sea si o si tipo byte pero no lo imprime asi
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);
        
        int numeroEntero = 32768;
        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("valor minimo short: " + Integer.MIN_VALUE);
        System.out.println("valor maximo short: " + Integer.MAX_VALUE);
        
        long numeroLong = 2147483648L; //confundir l con 1 entonces se coloca en mayuscula "L"
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo long: " + Long.MAX_VALUE);
        
        //cuando pasamos el 9223372036854775807 limite podemos colocar:
        //long numeroLong = (long)9223372036854775807F;
        //long numeroLong = (long)9223372036854775807D;
        
        /*
            tipos primitivos flotantes: float, double -> utiliza notacion exponencial
        */
        float numeroFloat = 10.0F; //-> o con conversion (float)10.0
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("valor minimo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo double: " + Double.MAX_VALUE);
        
        /*
            variable tipo var
        */
        
        var numeroEntero0 = 10;
        System.out.println("numeroEntero = " + numeroEntero0);
        
        var numeroDouble0 = 10.0;
        System.out.println("numeroDouble = " + numeroDouble0);
        
        var numeroFloat0 = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat0);
        
        /*
            variables de tipo caracter
        */
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021'; //tabla de caracteres
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; //tabla de caracteres (decimal) representacion
        System.out.println("varCharDecimal = " + varCharDecimal);
            
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo );
        
        int varCharSimbolo2 = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo2 );
        
        //si no colocamos char en tipo decimal se lee como entero
        //si cambiamos a entero saldra el decimal'
        
        /* tipos booleanos, valores solo true o false */
        boolean varBoolean =  false;
        System.out.println("varBoolean = " + varBoolean);
        
        if (varBoolean == true){ //(varBoolean) no es necesario true
            System.out.println("La bandera es verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        var esAdulto = edad >= 18 ; //forma de utilizar booleanos con expresiones 
        //eliminamos el uso de 3 lineas
        if (esAdulto){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
        //Convertir tipo String a tipo Int
        var edad0 = Integer.parseInt("20");
        System.out.println("edad = " + (edad0 +1));
        //concanetar diferentes maneras
        var edad1 = "20";
        System.out.println("edad = " + (edad1 +1));
        //son cosas diferentes
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        //parseInteger o parseDouble concatena
        
        //pedir valor
        var consola = new Scanner (System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(consola. nextLine()); //toma la cadena y la convierte a entero
        System.out.println("edad = "+ edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
    
        var caracter = "hola".charAt(0);//recuperamos un caracter segun indice
        System.out.println("caracter = " + caracter);
        
        var consola1 = new Scanner (System.in);
        System.out.println("Proporciona un caracter:");
        caracter = consola1.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
         
}
