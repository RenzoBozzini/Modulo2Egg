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
public class G02E05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(num));
      
    }
}
