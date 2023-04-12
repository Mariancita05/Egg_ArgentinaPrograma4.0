package Ejercicios_guia3;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 */
public class Ej_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;
        int suma;
        System.out.println("Ingrese un número límite");
        limite = leer.nextInt();

        suma = 0;
        while (suma < limite) {
            System.out.println("Ingrese un numero");
            suma += leer.nextInt();
        }
        System.out.println("La suma es de : " + suma);

    }

}
