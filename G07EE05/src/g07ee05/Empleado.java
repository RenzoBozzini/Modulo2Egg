/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07ee05;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 *
 * @author RENZO
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double calcular_aumento() {
        if (edad > 30) {
            return (this.salario * 1.1);
        } else {
            return (this.salario * 1.05);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
    
}
