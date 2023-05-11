/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10e03;

import java.util.Scanner;
import servicio.AlumnoServicio;

/**
 *
 * @author RENZO
 */
public class G10E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AlumnoServicio as = new AlumnoServicio();
        as.crearAlumno();
        System.out.println("Ingrese el nombre del alumno que quiere la nota final");
        String n = leer.next();
        System.out.println(as.notaFinal(n));
        
    }
    
}
