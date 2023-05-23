/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11e01;

import entidad.Perro;
import entidad.Persona;

/**
 *Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 * @author RENZO
 */
public class G11E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro dog1 = new Perro("Pulgas", "ovejero", 3, "grande");
        Persona p1 = new Persona("Juan", "Perez", 33, 30666777, dog1);
        Perro dog2 = new Perro("Sasha", "doberman", 5, "grande");
        Persona p2 = new Persona("Ana", "Paez", 35, 32444555, dog2);
        
        System.out.println(p1);
        System.out.println(p2);
        
        
        
    }
    
}
