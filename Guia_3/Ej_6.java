
package Guia_3;

import java.util.Scanner;

public class Ej_6 {

    public static void main(String[] args) {
    /*Implementar un programa que le pida dos números enteros al usuario y
    determine si ambos o alguno de ellos es mayor a 25.*/
    Scanner leer = new Scanner(System.in);
    String numero1;
    String numero2;
    System.out.println("Ingresa un número entero");
    System.out.println("Ingresa otro número entero");   
    numero1 = leer.next();
    numero2 = leer.next();
    //convertir string a int
    int num1 = Integer.parseInt(numero1);
    int num2 = Integer.parseInt(numero2);    
    
    if (num1 > 25 && num2 > 25) { 
    System.out.println("Ambos números son mayores que 25"); 
    }else if (num1 > 25 || num2 > 25){ 
    System.out.println("Alguno de los números es mayor que 25");
    }else{System.out.println("Ninguno de los números es mayor que ");
    }
    }
    
}
