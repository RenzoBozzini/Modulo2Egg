/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07ee05;

import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class G07EE05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String aux;

        do {
            System.out.println("Ingrese el nombre, la edad y el salario del empleado");
            Empleado nuevoEmpleado = new Empleado(leer.next(), leer.nextInt(), leer.nextDouble()); //String nombre, int edad, double salario
            System.out.println(nuevoEmpleado.getNombre() + " tiene un salario final con aumento de: " + nuevoEmpleado.calcular_aumento());
            System.out.println("Desea ingresar otro empleado? s/n");
            aux = leer.next();
        } while (aux.equals("s"));
    }
}
