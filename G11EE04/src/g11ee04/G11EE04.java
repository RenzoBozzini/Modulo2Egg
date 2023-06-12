/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11ee04;

import entidad.Alumnos;
import java.util.ArrayList;
import servicios.Simulador;

/**
 *
 * @author RENZO
 */
public class G11EE04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Simulador servicioSimulador = new Simulador();
         
        System.out.println("Bienvenidos! EGG Rotos");
        
        
        
        ArrayList<String> alumnos = servicioSimulador.generarListaAlumnos();
        System.out.println(alumnos);
        ArrayList<Integer> dnis = servicioSimulador.generarListaDNI(alumnos);
        System.out.println(dnis);
        ArrayList<Alumnos> ListaAlumnosCompleta = servicioSimulador.crearAlumno(dnis, alumnos);
        
        servicioSimulador.mostrarAlumnos(ListaAlumnosCompleta);
        
        //Prueba Luis
        
        servicioSimulador.mostrarVotos(servicioSimulador.votacion(ListaAlumnosCompleta));
        servicioSimulador.recuentoVotos(ListaAlumnosCompleta);
        servicioSimulador.facilitadores(ListaAlumnosCompleta);
        
    }
        
    }
   
