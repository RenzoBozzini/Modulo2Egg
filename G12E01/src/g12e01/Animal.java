/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12e01;

/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. 
 * @author RENZO
 */
public class Animal {
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
        
    public void alimentarse(){
        System.out.println(nombre + " se alimenta de "+ alimento);
    }
    
}
