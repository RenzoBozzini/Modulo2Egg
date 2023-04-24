/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.ParDeNumeros;

/**
 *
 * @author RENZO
 */
public class ParDeNumerosServicios {
    /*
    a) Método mostrarValores que muestra cuáles son los dos números
guardados.
    */
    ParDeNumeros numeros = new ParDeNumeros();
    
    public void mostrarValores(){
        System.out.println("El numero 1 es: " + numeros.getNum1());
        System.out.println("El numero 2 es: " + numeros.getNum2());
    }
    /*
    b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
    */
    public double devolverMayor(){
        if (numeros.getNum1() > numeros.getNum2()) {
            return numeros.getNum1();            
        }else if(numeros.getNum1() < numeros.getNum2()){
            return numeros.getNum2();
        }else{
            return numeros.getNum1(); //los numeros son iguales
        }
    }
    /*
    c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
    */    
    public double calcularPotencia(){
        double exponente;
        if (devolverMayor() == numeros.getNum1()) {
            exponente = numeros.getNum2();            
        }else{
            exponente = numeros.getNum1();
        }
        return (Math.round(Math.pow(devolverMayor(), exponente)));
    }
    /*
    d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
    */
    public double calcularRaiz(){
        double radicando;
        if (devolverMayor() == numeros.getNum1()) {
            radicando = numeros.getNum2();            
        }else{
            radicando = numeros.getNum1();
        }
        radicando = Math.abs(radicando);
        return Math.sqrt(radicando);        
    }   
}
