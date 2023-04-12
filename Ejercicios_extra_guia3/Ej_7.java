
package Ejercicios_extra_guia3;

import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones 
del programa, una usando el bucle “while” y otra con el bucle “do - while”.

 */
public class Ej_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números");
        int n = leer.nextInt();
        int num;
        int min = 0;
        int max = 0;
        int suma = 0;
        int i = 0;
        
    do{
            System.out.print("Introduzca un número ENTERO : ");
            num = leer.nextInt();
            suma += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            i++;
    }while (n != i );   
    double prom = suma / n;
    System.out.println("Valor máximo: " + max);
    System.out.println("Valor mínimo: " + min);
    System.out.println("Promedio: " + prom);    
    }
    
}
