/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g08e03;

import entidad.Persona;
import java.util.Scanner;
import servicios.PersonaServicio;

/**
 *
 * @author RENZO
 */
public class G08E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaServicio p1 = new PersonaServicio();
        
        Persona[] pacientes = new Persona[4];
        
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println("Se ingresan los datos de la persona: " + pacientes[i].nombre);
            pacientes[i]=p1.crearPersona();
        }
        System.out.println("El resultado de cada paciente es:");
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println("Paciente: "+i);
            System.out.println("Si -1 peso bajo, 0 OK y 1 sobrepeso): " + p1.calcularIMC(pacientes[i]));
            System.out.println("Es Mayor de edad? "+p1.esMayorDeEdad(pacientes[i]));
        }
        
        p1.porcentajes(pacientes);        
        
    }
    
}
