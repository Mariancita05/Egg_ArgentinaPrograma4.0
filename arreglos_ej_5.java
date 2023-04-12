
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
public class arreglos_ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros para la matriz");
        int[][] matriz = new int[3][3];
        int[][] matriztras = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = leer.nextInt();
                matriz[i][j] = num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriztras[i][j] = (matriz[i][j] * -1);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriztras[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

