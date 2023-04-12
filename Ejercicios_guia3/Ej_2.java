
package Ejercicios_guia3;

import java.util.Scanner;

/**
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
 * Incorrecto. Nota: investigar la función equals() en Java.

 */
public class Ej_2 {
public static void main(String[] args) {
            
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("CORRECTO");  
        }else{
            System.out.println("INCORRECTO");  
        }
    
    }
    
}
