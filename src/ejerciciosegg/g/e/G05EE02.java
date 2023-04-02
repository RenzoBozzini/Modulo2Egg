/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 * @author RENZO
 */
public class G05EE02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos de los vectores");
        int dimension = leer.nextInt();
        System.out.println("Los vectores son iguales? " + vectoresIguales(cargarVector(dimension), cargarVector(dimension)));
    }

    public static int[] cargarVector(int dimension) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[dimension];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor del elemento " + i);
            vector[i] = leer.nextInt();
        }
        imprimirVector(vector);
        return vector;
    }

    public static void imprimirVector(int[] vector) {
        System.out.print("Vector ingresado: [");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }

    public static boolean vectoresIguales(int[] vectorA, int[] vectorB) {
        for (int i = 0; i < vectorA.length; i++) {
            if (vectorA[i] != vectorB[i]) {
                return false;
            }
        }
        return true;
    }

}
