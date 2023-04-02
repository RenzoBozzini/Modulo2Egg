/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 * @author RENZO
 */
public class G05EE04 {
    public static void main(String[] args) {
        System.out.println("Ingrese las notas de los 10 alumnos");
        double[] notasClase = new double[2]; // cantidad de alumno
        for (int i = 0; i < notasClase.length; i++) {
            notasClase[i]=cargarNotas();
        }
        imprimirVector(notasClase);
    }
    public static double cargarNotas() {
        Scanner leer = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        double[] vector = new double[4];
        System.out.println("Ingrese las notas del 1er y 2do practico y del 1er y 2do integrador:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = leer.nextInt();
        }
        imprimirVector(vector);
        double prom = (vector[0]*0.1+vector[1]*0.15+vector[2]*0.25+vector[3]*0.5);
        
        return prom;
    }

    public static void imprimirVector(double[] vector) {
        System.out.print("Las notas ingresadas son: [");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }
    
}
