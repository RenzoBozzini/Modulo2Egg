/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author RENZO
 */
public class G05E06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamano, aux;
        aux = 0;

        System.out.println("Ingrese el tamaño de la matriz");
        tamano = leer.nextInt();
        int[][] matriz;
        matriz = new int[tamano][tamano];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.println("Ingrese el elemento de la posición: " + i + " " + j);
                matriz[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(esMagica(matriz));     
    }

    public static boolean esMagica(int[][] matriz) {
        // Calcular la suma mágica
        //int sumaMagica = matriz.length * (matriz.length * matriz.length + 1) / 2;
        
        // Verificar que la suma de cada fila, columna y diagonal sea igual a la suma mágica
        
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            int sumaDiagonalPrincipal = 0;
            int sumaDiagonalSecundaria = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if (i == j) {
                    sumaDiagonalPrincipal += matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    sumaDiagonalSecundaria += matriz[i][j];
                }
            }
            if (sumaFila != sumaColumna && sumaDiagonalPrincipal != sumaDiagonalSecundaria) {
                return false;
            }
        }
        // Si todas las sumas son iguales a la suma mágica, la matriz es mágica
        return true;
    }

}
