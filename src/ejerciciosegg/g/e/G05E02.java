/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 *
 * @author RENZO
 */
public class G05E02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamano;
        System.out.println("Ingrese el tamaño del vector");
        tamano = leer.nextInt();
        int[] vector = new int[tamano];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }
        System.out.println("");
        System.out.println("Ingrese un valor que este dentro del vector");
        int valor = leer.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valor) {
                System.out.println("El valor se encuentra en el subindice: " + "[ " + i + " ]");

            }

        }

    }
}
