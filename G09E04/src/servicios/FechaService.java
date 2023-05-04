/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 * Vamos a usar la clase Date que ya existe en Java. 
 * Crearemos la clase FechaService, en paquete Servicios, 
 * que tenga los siguientes métodos: 
 * a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
 * Luego los pase por parámetro a un nuevo objeto Date. 
 * El método debe retornar el objeto Date. 
 * Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
 * b) Método fechaActual que cree un objeto fecha con el día actual. 
 * Para esto usaremos el constructor vacío de la clase Date. Ejemplo: 
 * Date fechaActual = new Date(); El método debe retornar el objeto Date. 
 * c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
 * de años entre una y otra (edad del usuario).
 *
 * @author RENZO
 */
public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.println("Ingrese dia de nacimiento");
        int d = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int m = leer.nextInt();
        System.out.println("Ingrese año de nacimiento");
        int a = leer.nextInt();
        
        Date f = new Date(a-1900, m-1, d);

        return f;
    }
    
    public Date fechaActual(){
        Date fechAct = new Date();
        return fechAct;
    }
    
    public int diferencia(Date a,Date b){
        return a.getYear()-b.getYear();
    }

}
