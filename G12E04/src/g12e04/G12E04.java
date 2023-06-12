/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12e04;

import entidades.Circulo;
import entidades.Rectangulo;
import java.util.Scanner;

/**
 * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos para calcular el área, el perímetro y el valor de PI como constante. Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el resultado final. Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro. Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 *
 * @author RENZO
 */
public class G12E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo");
        Circulo c = new Circulo(leer.nextDouble());
        
        System.out.println("El perimetro del circulo es: " + c.perimetro());
        System.out.println("El area del circulo es: " + c.area());
        
        System.out.println("Ingrese la base del rectangulo y luego la altura");
        Rectangulo r = new Rectangulo(leer.nextDouble(), leer.nextDouble());
        
        System.out.println("El perimetro del rectangulo es: " + r.perimetro());
        System.out.println("El area del rectangulo es: " + r.area());

    }

}
