/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07e02;

import Matematicas.Circunferencia;
import java.util.Scanner;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio)
 * @author RENZO
 */
public class G07E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        Circunferencia circulo1 = new Circunferencia(leer.nextDouble());
        System.out.println("El radio ingresado es:");
        System.out.println(circulo1.getRadio());
        System.out.println("Desea cambiar el radio s/n");
        String aux = leer.next();
        if (aux.equals("s")) {
            System.out.println("Ingrese el radio del circulo");
            circulo1.crearCircunferencia(leer.nextInt());
            System.out.println("El nuevo radio es de: ");
            System.out.println(circulo1.getRadio());
        }
        System.out.println("El area del circulo es: "+circulo1.area());
        System.out.println("El perimetro del circulo es: "+circulo1.perimetro());
    }
    
}
