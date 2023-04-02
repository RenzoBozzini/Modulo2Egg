/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 *
 * @author RENZO
 */
public class G05EE06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        int aux = 0;

        System.out.println("Ingrese 5 palabras de 3 a 5 caracteres");
        String[] palabra = new String[5]; //construimos un vector con las 5 palabras
        for (int i = 0; i < palabra.length; i++) {
            do {
                palabra[i] = leer.next();
            } while (palabra[i].length() < 3 || palabra[i].length() > 5);
            System.out.println("Palabra ingresada correctamente: " + palabra[i]);
        }

        for (int i = 0; i < 20; i++) { //Escribo una matriz de 0
            for (int j = 0; j < 20; j++) {
                //sopa[i][j] = "0";
                String numCadena= Integer. toString((int)(Math.random()*10));
                sopa[i][j] = numCadena;
                
                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------");

        for (int h = 0; h < 5; h++) { //sobreescribo matriz de ceros con las palabras
            int g = (int) (Math.random() * 20);
            for (int k = 0; k < palabra[aux].length(); k++) {
                sopa[g][k] = palabra[aux].substring(k, k + 1);
            }
            aux++;
        }

        for (int i = 0; i < 20; i++) { // imprimo la nueva matriz
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
