/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marian
 */
public class arreglos_ej5 {

    /**
     * @param args the command line arguments
     */
    public class Ejercicio5 {

        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese los numeros para la matriz");
            int[][] matriz = new int[3][3];
            int[][] matriztras = new int[3][3];
            llenarmatriz(matriz, leer);
            llenarmatriztras(matriz, matriztras);
            mostrarmatriz(matriz);
            mostrarmatriztras(matriztras);
        }

        public static void llenarmatriz(int[][] matriz, Scanner leer) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int num = leer.nextInt();
                    matriz[i][j] = num;
                }
            }
        }

        public static void llenarmatriztras(int[][] matriz, int[][] matriztras) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriztras[i][j] = (matriz[i][j] * -1);
                }
            }
        }

        public static void mostrarmatriz(int[][] matriz) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + matriz[i][j] + " ");
                }
                System.out.println("");
            }
        }

        public static void mostrarmatriztras(int[][] matriztras) {
            System.out.println(" ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + matriztras[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
