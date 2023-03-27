/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 * @author RENZO
 */
public class G03EE03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra vocal");
        letra = leer.next();
        letra = letra.toLowerCase();
        switch (letra) {
            case "a":
                System.out.println("Elegiste la primer vocal, bien campeón!");
                break;
            case "e":
                System.out.println("Elegiste la segunda vocal, bien campeón!");
                break;
            case "i":
                System.out.println("Elegiste la tercer vocal, bien campeón!");
                break;
            case "o":
                System.out.println("Elegiste la cuarta vocal, bien campeón!");
                break;
            case "u":
                System.out.println("Elegiste la quinta vocal, bien campeón!");
                break;
            default:
                System.out.println("Ponete a estudiar ya!!!");
        }   
    }
}
