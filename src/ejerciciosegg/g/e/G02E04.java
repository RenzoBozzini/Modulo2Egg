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
public class G02E04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la temp. en centigrados");
        double centigrados = leer.nextDouble();
        System.out.println("La temp. en grados Fahrenheit es: " + (32+(9*centigrados/5)));
    }
}
