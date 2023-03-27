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
public class G02E01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros por teclado"); 
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La suma de los dos numeros es: " + (num1+num2));
        System.out.println("El valor max ingresado de ambos es: " + Math.max(num1, num2));
        System.out.println("Ingrese una frase y le diremos la longitud");
        String frase = leer.next();
        System.out.println(frase.length());
    }
}
