/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marian
 */
public class arreglos_extra_4 {

    /**
     * @param args the command line arguments
     */
    import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] not = new int[10][4];
        int cont, n, tp1, tp2, tp3, tp4;
        double nota1 = 0, nota2 = 0,nota3 = 0, nota4 = 0, promedio, contadorA= 0, contadorD= 0;
        
         Scanner leer= new Scanner (System.in);
       
       
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 4; j++) {
                not[i][j] = (int) (Math.random()*10)+1;              
                
            }
        }
        
        for (int i = 0; i < 10; i++) {
              for (int j = 0; j < 4; j++) {
                System.out.println("Nota "+ not[i][j] + " ");
            }
              System.out.println(" ");
        }
        
        
         for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 4; j++) {
               
                if (j == 0){
                tp1 = not[i][j]       ;
                nota1 = tp1 * 0.1;
                }
                if (j == 1){
                tp2 = not[i][j];
                nota2 = tp2 * 0.15;
                }
                if (j == 2){
                tp3 = not[i][j];
                nota3 = tp3 * 0.25;
                }
                if (j == 3){
                tp4 = not[i][j];
                nota4 = tp4 * 0.50;
                
                }               
               
            }
            
            promedio = (nota1 + nota2 + nota3 + nota4) / 4;
            if (promedio > 7)  {
                contadorA++;
            }else {
            contadorD++;
            }         
            
            
        }
        
        
        System.out.println("La cacntidad de alumnos desaprovados es: " +  contadorD);
        System.out.println("La cantidad de alumnos desaprovados" + contadorA );
        
    }
    
    
    
}