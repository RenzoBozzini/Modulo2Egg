/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 *
 * @author RENZO
 */
public class G03E06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        String opcion1;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();

        do {
            System.out.println("Menu: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion");

            do {
                opcion = leer.nextInt();
            } while (opcion > 5 || opcion < 1);
            
            opcion1="n";
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La divicion de los numeros es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Seguro que quiere salir S/N");
                    opcion1 = leer.next();
                    break;
            }

        } while (opcion1.equalsIgnoreCase("n"));
        //opcion = 1

    }

}
