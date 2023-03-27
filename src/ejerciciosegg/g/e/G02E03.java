/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class G02E03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        System.out.println("La frase es mayuscula: " + frase.toUpperCase());
        System.out.println("La frase en minuscula: " + frase.toLowerCase());
    }
}
