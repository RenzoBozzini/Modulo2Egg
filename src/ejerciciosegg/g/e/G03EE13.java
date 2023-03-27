/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Crear un programa que dibuje una escalera de números, donde cada línea de
 * números comience en uno y termine en el número de la línea. Solicitar la
 * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
 * número 3: 1 12 123
 *
 * @author RENZO
 */
public class G03EE13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un nuemro para dibujar la escalera");
        num = leer.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j <= i) {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
}
