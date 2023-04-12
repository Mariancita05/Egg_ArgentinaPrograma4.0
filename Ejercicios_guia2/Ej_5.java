
package Ejercicios_guia2;

import java.util.Scanner;

public class Ej_5 {

    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre
        por pantalla el doble, el triple y la raíz cuadrada de ese número.*/
        Scanner leer = new Scanner(System.in);
        String numero;
        System.out.println("Ingresa un número");
       
        numero = leer.next();
        //convertir string a int
        int num = Integer.parseInt(numero);
        int doble = num * 2;
        int triple = num * 3;
        double raizCuadrada = Math.sqrt(num);
        System.out.println("El doble del número es: " + doble + ", el triple del número es: " + triple + " y su raiz cuadrada es: " + raizCuadrada + ".");
    }
    
}
