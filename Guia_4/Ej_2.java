/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Marian
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        boolean seguir = true;

        while (seguir) {
            System.out.println("Ingrese el nombre de la persona:");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad de " + nombre + ":");
            edad = leer.nextInt();
            leer.nextLine();

            MayorDeEdad(nombre, edad);

            System.out.println("¿Quiere seguir ingresando personas? (Si/No)");
            String respuesta = leer.nextLine();
            seguir = respuesta.equalsIgnoreCase("Si");

        }
    }

    public static void MayorDeEdad(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }
}
