
package Ejercicios_guia3;

import java.util.Scanner;

/**
Crear un programa que dado un número determine si es par o impar.

 */
public class Ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num % 2 ==0) {
            System.out.println("El número es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}
