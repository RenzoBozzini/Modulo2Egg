/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class Circulo implements CalculosFormas {
    
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }  
    
    @Override
    public double perimetro() {
        return p * 2 * this.radio;
    }

    @Override
    public double area() {
        return p * radio * radio;
    }

}
