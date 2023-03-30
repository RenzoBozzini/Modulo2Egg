/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Random;
import java.util.Scanner;

/*
  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
  cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
  @author RENZO
 */
public class G05E03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        int[] vector = new int[tamano];

        int cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Ingrese el valor del elemento: " + i);
              vector[i] = leer.nextInt();
            //vector[i] = new Random().nextInt(99999);
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > 0 && vector[i] < 10) { // 9 777
                cont1++; // sumo los valores con 1 digito
            } else if (vector[i] >= 10 && vector[i] < 100) { //22
                cont2++; //sumo los valores con 2 digitos
            } else if (vector[i] >= 100 && vector[i] < 1000) { // 456
                cont3++;
            } else if (vector[i] >= 1000 && vector[i] < 10000) { // 456
                cont4++;
            } else if (vector[i] >= 10000 && vector[i] < 100000) { // 456
                cont5++;
            }

        }

        System.out.println("Los numeros con un digito son: " + cont1);
        System.out.println("Los numeros con dos digito son: " + cont2);
        System.out.println("Los numeros con tres digito son: " + cont3);
        System.out.println("Los numeros con cuatro digito son: " + cont4);
        System.out.println("Los numeros con cinco digito son: " + cont5);

    }
}
