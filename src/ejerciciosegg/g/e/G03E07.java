/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 * @author RENZO
 */
public class G03E07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String caracter;
        int contador = 0;
        int contador1 = 0;
        System.out.println("Ingrese la secuencia de un dispositivo RS232");
        do {
            caracter = leer.nextLine();

            if (caracter.length() <= 5) {
                if (caracter.substring(0, 1).equalsIgnoreCase("x") && caracter.substring(caracter.length() - 1, caracter.length()).equalsIgnoreCase("o")) {
                    contador++;
                } else {
                    contador1++;
                }
            }
        } while (!caracter.equals("&&&&&")); // ver como es el no igual en string jaja
        System.out.println("Las secuencias correctas son: " + contador);
        System.out.println("Las secuencias incorrectas son: " + (contador1 - 1));
    }
}
