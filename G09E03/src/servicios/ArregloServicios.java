/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Arrays;

/**
 *
 * @author RENZO
 */
public class ArregloServicios {

    /*
    1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
     */
    public void inicializarA(double[] unArreglo) {
        double variable;
        for (int i = 0; i < unArreglo.length; i++) {
            variable = Math.round(Math.random() * 10);
            Arrays.fill(unArreglo, i, i + 1, variable);
        }
    }

    /*
     Método mostrar recibe un arreglo por parámetro y lo muestra por
     pantalla.
     */
    public void mostrar(double[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    /*
    3) Método ordenar recibe un arreglo por parámetro y lo ordena de
    mayor a menor.
    */
    

}
