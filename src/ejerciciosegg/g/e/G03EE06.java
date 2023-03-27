/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 * @author RENZO
 */
public class G03EE06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String aux;
        double altura,sumaaltura,sumaaltura16,contador,contador16,promedio,promedio16;
        sumaaltura = 0;
        sumaaltura16 = 0;
        contador = 0;
        contador16 = 0;

        do {
            System.out.println("Ingrese una altura");
            altura = leer.nextDouble();
            
            if (altura < 1.6) {
            sumaaltura16 = sumaaltura16 + altura;  
            contador16++;
            }
            
            sumaaltura = sumaaltura + altura;
            contador++;
            
            System.out.println("s para ingresar otra altura y cualquier otro caracter para continuar");
            aux = leer.next();
            aux = aux.toLowerCase();
        } while (aux.equals("s"));
        promedio = sumaaltura/contador;
        System.out.println("El promedio de estaturas es: " + promedio);
        promedio16 = sumaaltura16/contador16;
        System.out.println("El promedio de estaturas por debajo de 1.60 m es: " + promedio16);
    }
}
