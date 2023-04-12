
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marian
 */
public class ej_4_guia4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero para averiguar si es primo");
        int numero;
        boolean chek;
        numero = sc.nextInt();
        if (esPrimo(numero)) {
            System.out.println("es un numero primo");
        } else {
            System.out.println("no es un numero primo");
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
