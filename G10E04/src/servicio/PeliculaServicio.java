/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no. Después de ese bucle realizaremos las siguientes acciones: • Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las películas con una duración mayor a 1 hora. • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla. • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 *
 *
 * @author RENZO
 */
public class PeliculaServicio {

    Scanner leer; //buena practica
    Pelicula unaPeli;
    ArrayList<Pelicula> listaPeli;

    public Pelicula crearPeli() {
        leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre de la peli");
        String nombre = leer.next();
        System.out.println("Ingrese el director de la peli");
        String director = leer.next();
        System.out.println("Ingrese la duracion de la peli");
        Double duracion = leer.nextDouble();

        unaPeli = new Pelicula(nombre, director, duracion);

        return unaPeli;
    }

    public void crearListaPeli() {
        listaPeli = new ArrayList<>();
        String aux;
        do {
            System.out.println("----------Ingrese una pelicula----------");
            listaPeli.add(crearPeli());
            System.out.println("Desea agregar otra Peli? (s)");
            aux = leer.next();
        } while (aux.equals("s"));

    }

    public void mostrarListaPeli() {
        System.out.println("Se creo la siguiente lista de peliculas:");
        System.out.println(listaPeli);
    }

    public void duranMasDeUnaHora() {
        System.out.println("");
        System.out.println("Se listan a continuación pelis que duran mas de 1 hora");
        for (Pelicula pelicula : listaPeli) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarDuracion() {
        System.out.println("");
        System.out.println("A continuacion se ordenan las Pelis de menor a mayor duracion");
        Collections.sort(listaPeli,
                (Pelicula objeto1, Pelicula objeto2) -> objeto1.getDuracion().compareTo(objeto2.getDuracion()));
        System.out.println(listaPeli);
    }

    public void ordenarTitulo() {
        System.out.println("");
        System.out.println("A continuacion se ordenan los titulos de Pelis alfabeticamente");
        Collections.sort(listaPeli,
                (Pelicula objeto1, Pelicula objeto2) -> objeto1.getTitulo().compareTo(objeto2.getTitulo()));
        System.out.println(listaPeli);
    }

    public void ordenarDirector() {
        System.out.println("");
        System.out.println("A continuacion se ordenan los directores de Pelis alfabeticamente");
        Collections.sort(listaPeli,
                (Pelicula objeto1, Pelicula objeto2) -> objeto1.getDirector().compareTo(objeto2.getDirector()));
        System.out.println(listaPeli);
    }

}
