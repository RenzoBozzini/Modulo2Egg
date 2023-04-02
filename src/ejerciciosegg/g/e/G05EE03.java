/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 * @author RENZO
 */
public class G05EE03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int dimension = leer.nextInt();
        int[]arregloVector=new int[dimension];
        imprimirVector(aleatorioVector(arregloVector));
        
    }
    
    public static int[] aleatorioVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10);            
        }
        return vector;
    }
    
    public static void imprimirVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }
}
