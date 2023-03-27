/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 *
 * @author RENZO
 */
public class G03EE07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantnum;

        double numero, sumanumero, contador, promedio;
        sumanumero = 0;
        contador = 0;
        System.out.println("Ingrese la cantidad de nuemros a promediar");
        cantnum = leer.nextInt();
        do {
            System.out.println("Ingrese un numero");
            numero = leer.nextDouble();
            sumanumero = sumanumero + numero;
            contador++;
        } while (contador < cantnum);
        promedio = sumanumero / contador;
        System.out.println("El promedio de numeros es: " + promedio);
    }
}
