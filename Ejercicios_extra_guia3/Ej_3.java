package Ejercicios_extra_guia3;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 *
 */
public class Ej_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        //letra = letra.equalsIgnoreCase();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es una VOCAL");
        }else{
            System.out.println("La letra NO es una VOCAL");
        }
    }

}
