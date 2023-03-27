/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Realice un programa para que el usuario adivine el resultado de una
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10. El
 * programa debe indicar al usuario si su respuesta es o no correcta. En caso
 * que la respuesta sea incorrecta se debe permitir al usuario ingresar su
 * respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
 * la función Math.random() de Java.
 *
 * @author RENZO
 */
public class G03EE10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado;
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        do {
            System.out.println("Ingrese el resultado de la multiplicación random");
            resultado = leer.nextInt();
            if (resultado == (num1 * num2)) {
                System.out.println("Le pegaste!");
                break;
            }
        } while (true);

    }

}
