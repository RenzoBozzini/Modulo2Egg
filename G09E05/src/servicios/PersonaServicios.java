/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 * @author RENZO
 */
public class PersonaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona individuo = new Persona();
        System.out.println("Ingrese nombre de persona");
        individuo.setNombre(leer.next());
        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese año de nacimiento");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        individuo.setFecha(fecha);
               
        return individuo;        
    }
    
    public int calcularEdad(Persona p){
        Date fechaActual = new Date();
        return (fechaActual.getYear()-p.getFecha().getYear());
    }
    
    public boolean menorQue(Persona p, int edad){
      return calcularEdad(p)<edad;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha nacimiento" + p.getFecha());
    }
    
    
}
