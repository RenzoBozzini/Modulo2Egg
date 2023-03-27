/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: i. *
 * 0.86 libras es un 1 € ii. * 1.28611 $ es un 1 € iii. * 129.852 yenes es un 1
 * €
 *
 * @author RENZO
 */
public class G04E03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        double euros = leer.nextDouble();
        System.out.println("A que moneda desea hacer el cambio?");
        System.out.println("1. libras");
        System.out.println("2. dolar");
        System.out.println("3. yenes");
        int opcion = leer.nextInt();
        cambio(euros, opcion);

    }

    public static void cambio(double euros, int opcion) { // cuando la funcion dice void no lleva return
        switch (opcion) {
            case 1:
                System.out.println("De euro a libras el cambio es: " + (euros * 0.86));
                break;
            case 2:
                System.out.println("De euro a dolares el cambio es: " + (euros * 1.28611));
                break;
            case 3:
                System.out.println("De euro a yenes el cambio es: " + (euros * 129.852));
                break;
            default:
                System.out.println("Ingresaste una opcion no valida");
        }
        

    }
}
