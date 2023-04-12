/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_extra_guia3;

import java.util.Scanner;

/**
 *
 * @author Marian
 */
public class Ej_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = scanner.nextInt();
        
        int totalHijos = 0;
        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = scanner.nextInt();
            
            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = scanner.nextInt();
                totalHijos += edadHijo;
            }
        }
        
        double mediaEdad = (double) totalHijos / (numFamilias * totalHijos);
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}
