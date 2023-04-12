package Guia_3;

import java.util.Scanner;

public class Ej_8 {

    public static void main(String[] args) {
        /*Escriba un programa que valide si una nota está entre 0 y 10,
        sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota
        sea correcta.*/

        Scanner leer = new Scanner(System.in);

        int respuesta = 11;

        while (respuesta < 0 || respuesta > 10) {

            System.out.println("Ingrese la Nota entre 0 y 10");
            respuesta = leer.nextInt();
        }
        System.out.println("La nota ingresada es: " + respuesta);

    }

}


