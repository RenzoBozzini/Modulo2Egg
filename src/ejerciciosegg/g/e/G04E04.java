/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 * @author RENZO
 */
public class G04E04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println(esPrimo(num));
    }

    public static boolean esPrimo(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) { // Los primos tienen modulo igual a cero solo con 1 y con su mismo numero
            if (num % i == 0) {
                contador++;
            }
        }
        return contador == 2;
    }
}