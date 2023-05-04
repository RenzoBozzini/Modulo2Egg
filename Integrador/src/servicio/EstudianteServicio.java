/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Estudiante;

/**
 *
 * @author RENZO
 */
public class EstudianteServicio {

    public Estudiante[] escuela() {

        Estudiante[] estudiantes = new Estudiante[8];

        estudiantes[0] = new Estudiante("Juan", 7.5);
        estudiantes[1] = new Estudiante("Ana", 8.2);
        estudiantes[2] = new Estudiante("Pedro", 6.3);
        estudiantes[3] = new Estudiante("Marta", 9.1);
        estudiantes[4] = new Estudiante("Luis", 5.8);
        estudiantes[5] = new Estudiante("Laura", 7.9);
        estudiantes[6] = new Estudiante("Carlos", 8.8);
        estudiantes[7] = new Estudiante("Lucía", 6.7);
        // promedio 7,5375
        return estudiantes;
    }

    public double promedio(Estudiante[] curso) {
        double sumat = 0;
        for (int i = 0; i < curso.length; i++) {
            sumat = sumat + curso[i].getNota();
        }
        double promedio = sumat / curso.length;
        return promedio;
    }

    public void estProm(Estudiante[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i].getNota() > promedio(c)) {
                System.out.println("- " + c[i].getNombre());
            }
        }
    }

}
