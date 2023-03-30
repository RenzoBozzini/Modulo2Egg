/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Random;

/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
 * sus filas por columnas (o viceversa).
 * @author RENZO
 */
public class G05E05 {
    public static void main(String[] args) {

        int[][] matrixA = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //matrixA[i][j] = (int) (Math.random() * 10);
                Random rnd = new Random();
                //matrixA[i][j] = rnd.nextInt(20-10+1)+10;
                matrixA[i][j] = rnd.nextInt(10 - -10 +1) - 10; // (int)(Math.random()*(HASTA-DESDE+1)+DESDE)
                
                                
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La transpuesta de la matriz es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + -1*matrixA[j][i] + " ");
            }
            System.out.println();
        }
    }  
    
}
