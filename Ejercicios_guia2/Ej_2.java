
package Ejercicios_guia2;

import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
    /*Escribir un programa que pida tu nombre, lo guarde en una variable
    y lo muestre por pantalla.*/
     Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        System.out.println("¡Hola " + nombre + "!");
    }
    
}
