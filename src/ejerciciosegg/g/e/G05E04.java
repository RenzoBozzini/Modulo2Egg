/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author RENZO
 */
public class G05E04 {

    public static void main(String[] args) {

        int[][] matrixA = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
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
                System.out.print(" " + matrixA[j][i] + " ");
            }
            System.out.println();
        }
    }
}
