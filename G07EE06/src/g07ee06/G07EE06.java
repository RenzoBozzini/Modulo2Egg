/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07ee06;

import java.util.Scanner;

/**
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y 
 * un método "calcular_area" que calcule y devuelva el área del rectángulo. 
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
 * y imprime el área del rectángulo.
 *
 * @author RENZO
 */
public class G07EE06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese lado 1 y lado 2 del rectangulo");
        Rectangulo rectangulo1 = new Rectangulo(leer.nextInt(), leer.nextInt());
        System.out.println("El area del rectangulo es: " + rectangulo1.calcular_area());
    }
}
