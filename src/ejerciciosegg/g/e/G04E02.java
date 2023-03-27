/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 * @author RENZO
 */
public class G04E02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        String nombre, opcion;

        do {
            System.out.println("Ingrese el nombre y la edad de la persona");
            nombre = leer.next();
            edad = leer.nextInt();
            System.out.println("La persona es mayor de edad? " + mayorDeEdad(nombre, edad));
            System.out.println("Desea ingresar otra persona?");
            opcion = leer.next();
        } while (!opcion.equals("no"));
    }

    public static boolean mayorDeEdad(String nombre, int edad) {
        boolean retorno;
        retorno = false;
        System.out.println(nombre + " tiene " + edad + " años");
        if (edad >= 18) {
            retorno = true;
        }
        return retorno;
    }
}
