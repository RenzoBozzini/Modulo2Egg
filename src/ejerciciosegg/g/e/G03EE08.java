/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 *
 * @author RENZO
 */
public class G03EE08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, contador, par, impar;
        contador = 0;
        par = 0;
        impar = 0;

        do {
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();
            if (num >= 0) {
                contador++;
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        } while (num % 5 != 0);

        System.out.println("La cantidad de numero leidos fueron: " + contador);
        System.out.println("La cantidad de numero pares leidos fueron: " + par);
        System.out.println("La cantidad de numero impares leidos fueron: " + impar);
    }
}
