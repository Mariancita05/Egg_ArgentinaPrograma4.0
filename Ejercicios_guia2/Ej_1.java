
package Ejercicios_guia2;

import java.util.Scanner;

public class Ej_1 {

    public static void main(String[] args) {
        /*Escribir un programa que pida dos números enteros por teclado y 
        calcule la suma de los dos. El programa deberá después mostrar
        el resultado de la suma*/
        Scanner leer = new Scanner(System.in);
        String num1;
        String num2;
        System.out.println("Ingresa un número");
        System.out.println("Ingresa otro número");
        num1 = leer.next();
        num2 = leer.next();
        System.out.println("Los números ingresados son: " + num1 + " y " + num2);
        
    }
    
}
