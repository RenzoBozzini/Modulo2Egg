/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano.
 *
 * @author RENZO
 */
public class G03EE04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        switch (numero) {
            case 1:
                System.out.println("En romano es I");
                break;
            case 2:
                System.out.println("En romano es II");
                break;
            case 3:
                System.out.println("En romano es III");
                break;
            case 4:
                System.out.println("En romano es IV");
                break;
            case 5:
                System.out.println("En romano es V");
                break;
            default:
                System.out.println("No sabes las vocales andá a estudiar!");
        }
    }
}
