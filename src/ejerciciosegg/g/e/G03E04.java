/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 * @author RENZO
 */
public class G03E04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("Ingrese una frase que empiece con a");
        frase = leer.next();
        if (frase.substring(0,1).equalsIgnoreCase("a")) {
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto!");
        }
    }
}
