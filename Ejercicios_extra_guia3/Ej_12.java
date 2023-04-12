/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_extra_guia3;

/**
 *
 * @author Marian
 */
public class Ej_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        for (int i = 0; i <= 999; i++) {
    String formattedNumber = String.format("%03d", i); // formato de 3 dígitos con ceros a la izquierda
    formattedNumber = formattedNumber.replace("3", "E"); // reemplazar el número 3 con E
    System.out.println(formattedNumber);
}
    }
    
}
