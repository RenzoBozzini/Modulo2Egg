/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class RaicesServicios {

    Raices r = new Raices();

    public void valores() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero");
        r.setA(leer.nextInt());
        System.out.println("Ingrese el Segundo Numero");
        r.setB(leer.nextInt());
        System.out.println("Ingrese el Tercer Numero");
        r.setC(leer.nextInt());
    }

    //Método getDiscriminante(): devuelve el valor del discriminante
    //(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante() {
        return (Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()));
    }

    /*b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
     */
    public boolean tieneRaices() {
        return (getDiscriminante() > 0);
    }

    /*
    c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
     */
    public boolean tieneRaiz() {
        return (getDiscriminante() == 0);
    }

    /*
    d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
    -b±√((b^2)-(4*a*c)))/(2*a)
     */
    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("Las raices son:");
            System.out.println(-r.getB() + Math.sqrt(getDiscriminante()) / (2 * r.getA()));
            System.out.println(-r.getB() - Math.sqrt(getDiscriminante()) / (2 * r.getA()));
        }
    }

    public void obtenerRaiz() {
        /**
         * e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
         */
        if (tieneRaiz()) {
            double raiz = -r.getB() / (2 * r.getA());
            System.out.println("La única solución es: " + raiz);
        }
    }

    /*
    f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
     */

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene raices");
        }
    }

}
