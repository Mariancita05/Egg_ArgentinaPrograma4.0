
package Ejercicios_guia2;

import java.util.Scanner;

public class Ej_4 {

    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente
        en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        String temperatura;
        System.out.println("Ingresa la temperatura");
       
        temperatura = leer.next();
        //convertir string a int
        int centigrados = Integer.parseInt(temperatura);
        int fah = 32 + (9 * centigrados / 5);
        System.out.println(fah);
    }
    
}
