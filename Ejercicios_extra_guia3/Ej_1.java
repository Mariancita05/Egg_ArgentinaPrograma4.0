
package Ejercicios_extra_guia3;

import java.util.Scanner;

/**
Dado un tiempo en minutos, calcular su equivalente en días y horas.
* Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
* calcular su equivalente: 1 día, 2 horas.
 
 */
public class Ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un tiempo en minutos");
        int minutos = leer.nextInt();
        //int minutos;
        //minutos = 0;
        double horas = minutos / 60;
        double dias = horas / 24;
        
        //while (minutos > 0) {
            System.out.println(minutos + " minutos equivalen a: " + horas + " hora(s) y " + dias + " dia(s)");
        //}
        
        
        
    }
    
}
