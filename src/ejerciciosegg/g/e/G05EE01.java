/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 *
 * @author RENZO
 */
public class G05EE01 {

    public static void main(String[] args) {
        System.out.println("La suma de los elementos es: " + sumaVector(cargarVector()));    
    }

    public static int[] cargarVector() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del vector");
        int dimension = leer.nextInt();
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

    public static int sumaVector(int[] vector) {
        int aux;
        aux = 0;
        for (int i = 0; i < vector.length; i++) {
            aux = aux + vector[i];
        }
        return aux;
    }
}
