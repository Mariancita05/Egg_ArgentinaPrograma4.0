package Ejercicios_extra_guia3;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 */
public class Ej_6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas");
        int personas = leer.nextInt();
        double sumAltura = 0; // variable para almacenar la suma de todas las alturas
        int cantPersonasBajo160 = 0; // variable para almacenar la cantidad de personas con altura menor a 1.60 mts
        double sumAlturaBajo160 = 0; // variable para almacenar la suma de las alturas de las personas con altura menor a 1.60 mts
        
        for (int i = 1; i < personas; i++) {
            System.out.println("Ingresa la altura de la persona" + i + " en metros: ");
            double altura = leer.nextDouble();//accede al buffer de entrada para obtener un dato de tipo int y asignarlo a la variable n
            sumAltura += altura; // agregar la altura a la suma total
            
            if (altura < 1.6) {
                cantPersonasBajo160++; // aumentar la cantidad de personas con altura menor a 1.60 mts
                sumAlturaBajo160 += altura; // agregar la altura a la suma de alturas de personas con altura menor a 1.60 mts

            }
        }

        double promedioAltura = sumAltura / personas; // calcular el promedio de alturas en general
        double promedioAlturaBajo160 = cantPersonasBajo160 > 0 ? sumAlturaBajo160 / cantPersonasBajo160 : 0; // calcular el promedio de alturas de personas con altura menor a 1.60 mts, si hay al menos una persona con altura menor a 1.60 mts

        System.out.println("El promedio de estaturas en general es: " + promedioAltura + " metros.");
        System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedioAlturaBajo160 + " metros.");
    }

}
