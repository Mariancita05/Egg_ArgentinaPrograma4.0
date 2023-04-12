
package Ejercicios_extra_guia3;

import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, 
el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.
 */
public class Ej_11 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        int cont = 0;
        while (num != 0) {
            cont++;
            num /= 10;
        }
        System.out.println("El número de dígitos es: " + cont);
    }
}





