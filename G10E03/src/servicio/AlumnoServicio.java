/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.
 *
 * @author RENZO
 */
public class AlumnoServicio {

    Scanner leer;
    ArrayList<Alumno> listaAlumnos;
    Alumno alum;

    public void crearAlumno() {
        String aux;
        leer = new Scanner(System.in);
        listaAlumnos = new ArrayList();

        do {
            System.out.println("Ingrese el nombre del alumno");
            String nom = leer.next();

            System.out.println("Ingrese las 3 notas del alumno");
            ArrayList<Integer> listaNotas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                listaNotas.add(leer.nextInt());
            }
            listaAlumnos.add(new Alumno(nom, listaNotas));

            System.out.println("Quiere agregar otro alumno? (s)");
            aux = leer.next();

        } while (aux.equals("s"));

        System.out.println(listaAlumnos);
    }

    public Double notaFinal(String nom) {
        Iterator<Alumno> it = listaAlumnos.iterator();
        Double aux = 0.0;
        while (it.hasNext()) {
            Alumno alumnoX = it.next();
            if (alumnoX.getNombre().equals(nom)) {
                for (int i = 0; i < alumnoX.getNotas().size(); i++) {
                    aux = aux + alumnoX.getNotas().get(i);
                }
                break;
            }
        }
        return (aux / 3);
    }

}
