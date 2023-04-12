
package Ejercicios_guia2;

import java.util.Scanner;


public class Ej_3 {

    public static void main(String[] args) {
   /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
    y después toda en minúsculas. */
    Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una frase");
        frase = leer.nextLine();
        String fraseMinuscula = frase.toLowerCase();
        String fraseMayuscula = frase.toUpperCase();
        //mayuscula primera letra
        String primerLetra = frase.substring(0,1).toUpperCase()+frase.substring(1);
        System.out.println("La frase en mayúscula " + fraseMayuscula);
        System.out.println("La frase en minúscula " + fraseMinuscula);
        System.out.println("Primera letra " + primerLetra);
    }
    
}
