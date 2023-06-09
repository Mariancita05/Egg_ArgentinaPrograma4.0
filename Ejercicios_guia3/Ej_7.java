package Ejercicios_guia3;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 */
public class Ej_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String cadena;
        String entrada;
        int cont = 0;
        int cont2 = 0;
        int maxcarac;
        do {
            System.out.println("Ingrese las cadenas");
            cadena = leer.nextLine();
            //.length() devuelve un valor entero que indica la cantidad de
            //caracteres en la cadena de entrada
            maxcarac = cadena.length();
            // System.out.println("a" + cadena.substring(1, 0));
            
            //charAt() devuelve la posición del carácter que le pasemos como
            //parámetro en el interior de la cadena
            if (maxcarac == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                cont2 += 1;
                System.out.println("Entrada Correcta: " + cadena);

            } else if (maxcarac == 5 && cadena.charAt(0) != 'X' && cadena.charAt(4) != 'O') {
                cont += 1;
                System.out.println("Entrada Incorrecta: " + cadena);
                System.out.println("Ingreso Incorrecto Vuelva a intentar");

            } else {
                System.out.println("Max 5 Caracteres");

            }
            //equalsIgnoreCase toma MAYUSCULAS y minusculas
        } while (!cadena.equalsIgnoreCase("&&&&&&"));
        System.out.println("Ingresos Correctos : " + cont2);
        System.out.println("Ingresos Incorrectos : " + cont);
    }

}
