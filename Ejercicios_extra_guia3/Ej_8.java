package Ejercicios_extra_guia3;

import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad
de números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 
 */
public class Ej_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //int cont = 0;
        int contNum = 0;
        int contPar = 0;
        int contImpar = 0;
        while (true) {
            System.out.println("Ingrese un número entero");
            int num = leer.nextInt();
            
            if (num < 0) {
                continue; // Saltar números negativos
            }
            
            if (num % 5 == 0) {
                break; // Detener la lectura cuando se ingresa un múltiplo de cinco
            }
            contNum++; // Incrementar el contador de números leídos

            //if (num < 0) {
                if (num % 2 != 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
            System.out.println("Cantidad de pares : " + contPar);
            System.out.println("Cantidad de Impares : " + contImpar);
            System.out.println("Cantidad de Total : " + (contPar + contImpar));
        }
    }

    
