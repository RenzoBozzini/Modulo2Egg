/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 *
 * @author RENZO
 */
public class G04E01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        double num1,num2;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("Elija la operacion matematica a realizar");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los dos numeros es: " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta de los dos numeros es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los dos numeros es: " + multi(num1, num2));
                    break;
                case 4:
                    System.out.println("La division de los dos numeros es: " + divi(num1, num2));
                    break;
                case 5:
                    System.out.println("Eligió salir");
                    break;
                default:
                    System.out.println("Eligió una opcion no valida");
            }
        } while (opcion != 5);
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double divi(double a, double b) {
        return a / b;
    }
}
