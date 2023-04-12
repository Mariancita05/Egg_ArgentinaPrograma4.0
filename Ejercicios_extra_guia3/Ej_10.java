/*
Realice un programa para que el usuario adivine el resultado de una 
multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario 
ingresar su respuesta nuevamente. Para realizar este ejercicio investigue 
como utilizar la función Math.random() de Java.
 */
package Ejercicios_extra_guia3;

import java.util.Scanner;

/**
 *
 * @author Marian
 */
public class Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        //Random random = new Random();
        
        int num1 = (int)(Math.random()*10+1);
        int num2 = (int)(Math.random()*10+1);
        int resultado = num1 * num2;
        System.out.println("Adivina la multiplicación: x * y = " );
        //System.out.printf("Adivina la multiplicación: %d * %d = ", num1, num2);
        
        while (true) {
            int respuesta = scanner.nextInt();
            if (respuesta == resultado) {
                System.out.println("¡Correcto!");
                break;
            } else {
                System.out.println("Incorrecto. Inténtalo de nuevo.");
            }
        }
    }
}