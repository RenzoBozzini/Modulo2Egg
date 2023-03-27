/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Simular la división usando solamente restas. Dados dos números enteros
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
 * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un
 * resultado menor que el divisor, este resultado es el residuo, y el número de
 * restas realizadas es el cociente. Por ejemplo: 50 / 13: 50 – 13 = 37 una
 * resta realizada 37 – 13 = 24 dos restas realizadas 24 – 13 = 11 tres restas
 * realizadas dado que 11 es menor que 13, entonces: el residuo es 11 y el
 * cociente es 3.
 *
 * @author RENZO
 */
public class G03EE09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, resto, contador;
        System.out.println("Ingrese dos numero enteros mayores que 1 para dividir");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        contador = 0;
        resto = num1;

        do {
            resto = resto - num2;
            contador++;
        } while (resto > num2);

        System.out.println("El dividendo es: " + num1);
        System.out.println("El divisor es: " + num2);
        System.out.println("El cociente es: " + contador);
        System.out.println("El residuo es: " + resto);
    }
}
