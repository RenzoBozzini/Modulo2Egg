/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle 
 * un valor diferente a cada una. A continuación, realizar las instrucciones 
 * necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
 * el valor de D y D tome el valor de B. Mostrar los valores iniciales y 
 * los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * @author RENZO
 */
public class G03EE02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c,d,aux;
        System.out.println("Ingrese el valor de a: ");
        a = leer.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = leer.nextInt();
        System.out.println("Ingrese el valor de c: ");
        c = leer.nextInt();
        System.out.println("Ingrese el valor de d: ");
        d = leer.nextInt();
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
        System.out.println("El valor de d es: " + d);
    }
}
