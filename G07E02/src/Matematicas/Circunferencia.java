/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicas;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 * @author RENZO
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) { // punta a)
        this.radio = radio;
    }

    public Circunferencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getRadio() { // punto b)
        return radio;
    }

    public void setRadio(double radio) { // punto b)
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){ // punto c)
        this.radio = radio;
    }
    
    public double area(){
        double areaCircun = 3.14*radio*radio; // punto d)
        return areaCircun;
    }
    
    public double perimetro(){
        double perimetro = 2*3.14*radio; // punto e)
        return perimetro;
    }
    
}
