/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class Simulacion {

    List<Espectador> e = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cine ShowCase = new Cine();

    public void generarEspectadores() {
        String[] nombres = {"Juan", "Pedro", "Andres", "Julian", "Ana", "Maria", "Laura", "Paula"};
        int aux = 0;
        int edad;
        double dinero;
        for (int i = 0; i < 50; i++) {
            edad = (int) (Math.random() * (65 - 10) + 10);
            dinero = Math.random() * (5000 - 900) + 900;
            e.add(new Espectador(nombres[(int) (Math.random() * 7)], edad, dinero));
            aux++;
        }
        System.out.println("La cantidad de gente que hace la fila es: " + aux);
        System.out.println("Se detalla a continuación los datos de cada uno:");
        System.out.println(e);
    }

    public void cargarPeli() {
        System.out.println("Ingrese el nombre de la peli");
        String nombre = leer.next();
        System.out.println("Ingrese edad minima");
        int edadMin = leer.nextInt();
        System.out.println("Ingrese el director");
        String director = leer.next();
        System.out.println("Ingrese la duración de la peli");
        double duracion = leer.nextDouble();
        Pelicula unaPeli = new Pelicula(duracion, nombre, edadMin, director);
        System.out.println("Ingrese precio de la peli");
        ShowCase.setPrecio(leer.nextDouble());
        ShowCase.setUnaPeli(unaPeli);

    }

    public void llenadoSala() {

        int aux1 = 0;

        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).getEdad() < ShowCase.getUnaPeli().getEdadMin() || e.get(i).getDinero() < ShowCase.getPrecio()) {
                e.remove(i);
                aux1++;
            }
        }
        System.out.println("Luego del filtro de la edad y el dinero quedan: " + (50 - aux1));

        System.out.println("Imprimo el array de los 50 filtrada");
        System.out.println(e);

        System.out.println("-------Imprimo Asientos Vacios---------");
        boolean[][] Asientos = new boolean[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Asientos[i][j] = false;
                System.out.print("| Vacio |");
            }
            System.out.println("");
        }

        System.out.println("-------Mezclo e Imprimo sala según ejercicio:---------");

        do {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    int ii = (int) (Math.random() * 7);
                    int jj = (int) (Math.random() * 5);

                    switch (j) {
                        case 0:
                            System.out.print(8 - i);
                            System.out.print("A");
                            if (!e.isEmpty() && Asientos[ii][jj] == false) {
                                e.remove(0);
                                Asientos[ii][jj] = true;
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 1:
                            System.out.print(8 - i);
                            System.out.print("B");
                            if (!e.isEmpty() && Asientos[ii][jj] == false) {
                                e.remove(0);
                                Asientos[ii][jj] = true;
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 2:
                            System.out.print(8 - i);
                            System.out.print("C");
                            if (!e.isEmpty() && Asientos[ii][jj] == false) {
                                e.remove(0);
                                Asientos[ii][jj] = true;
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 3:
                            System.out.print(8 - i);
                            System.out.print("D");
                            if (!e.isEmpty() && Asientos[ii][jj] == false) {
                                e.remove(0);
                                Asientos[ii][jj] = true;
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 4:
                            System.out.print(8 - i);
                            System.out.print("E");
                            if (!e.isEmpty() && Asientos[ii][jj] == false) {
                                e.remove(0);
                                Asientos[ii][jj] = true;
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 5:
                            System.out.print(8 - i);
                            System.out.print("F");
                            if (!e.isEmpty() && Asientos[ii][jj] == false) {
                                e.remove(0);
                                Asientos[ii][jj] = true;
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;                        
                    }
                }
                System.out.println("");
            }
        } while (e.size() >= 1);
        
        System.out.println("-------Imprimo BIEN sala según ejercicio:---------");

        
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    
                    switch (j) {
                        case 0:
                            System.out.print(8 - i);
                            System.out.print("A");
                            if (Asientos[i][j] == true) {
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 1:
                            System.out.print(8 - i);
                            System.out.print("B");
                            if (Asientos[i][j] == true) {
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 2:
                            System.out.print(8 - i);
                            System.out.print("C");
                            if (Asientos[i][j] == true) {
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 3:
                            System.out.print(8 - i);
                            System.out.print("D");
                            if (Asientos[i][j] == true) {
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 4:
                            System.out.print(8 - i);
                            System.out.print("E");
                            if (Asientos[i][j] == true) {
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                        case 5:
                            System.out.print(8 - i);
                            System.out.print("F");
                            if (Asientos[i][j] == true) {
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            break;
                    }
                }
                System.out.println("");
            }
      
        

        ShowCase.setCapacidadSala(Asientos);
    }
}
