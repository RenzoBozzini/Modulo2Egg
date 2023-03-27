/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 * @author RENZO
 */
public class G03EE11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux,contador;
        contador = 0;
        System.out.println("Ingrese un numero entero y le diremos los digitos");
        int num = leer.nextInt(); //12
        do {            
            aux = num/10; //1.2
            num = aux;
            contador++;
        } while (aux>=1);
        System.out.println("El numero tiene "+ contador + " digitos");
    }
}
