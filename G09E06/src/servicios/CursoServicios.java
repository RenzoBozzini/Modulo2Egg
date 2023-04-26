/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class CursoServicios {

    /*
    d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
     */
    Scanner leer = new Scanner(System.in);
    //Curso matematicas = new Curso();

    public void cargarAlumnos(Curso matematicas) {
        String[] alumno = new String[5];

        for (int i = 0; i < matematicas.getAlumnos().length; i++) {
            alumno[i] = leer.next();
        }
        matematicas.setAlumnos(alumno); //no se puede desfragmentar un set
    }
    /*
    e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
    */
    public void crearCurso(Curso m){
        System.out.println("Ingrese nombreCurso");
        m.setNombreCurso(leer.next());
        System.out.println("Ingrese cantidadHorasPorDia");
        m.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese cantidadDiasPorSemana");
        m.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese turno");
        m.setTurno(leer.next());
        System.out.println("Ingrese precioPorHora");
        m.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(m);  
        
    }
    
    /*
    f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
5
    */
    
    public double calcularGananciaSemanal(Curso s){
        return s.getCantidadHorasPorDia()*s.getPrecioPorHora()*s.getAlumnos().length*s.getCantidadDiasPorSemana();
    }

}
