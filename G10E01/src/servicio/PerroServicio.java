/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 *
 * @author RENZO
 */
public class PerroServicio {

    public void listaRazas(Perro p) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Perro> lista = new ArrayList();
        char aux;

        do {
            System.out.println("Ingrese una raza de perro");
            
            lista.add(new Perro(leer.next()));
            System.out.println("Desea agregar otra raza?");
            aux = leer.next().charAt(0);
        } while (aux == 's');

        System.out.println(lista);
    }
}
