/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *Crear un programa que dado un número determine si es par o impar.
 * @author RENZO
 */
public class G03E01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        if (num%2 == 0) {
            System.out.println("El numero ingresado es par");
        } else{
            System.out.println("El numero es impar");
        }
    }
}
