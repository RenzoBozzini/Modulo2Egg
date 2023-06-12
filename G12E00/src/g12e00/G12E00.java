/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12e00;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RENZO
 */
public class G12E00 {

    /**
     * Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo “Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear un ArrayList de animales y los siguientes animales Animal a = new Animal(); Animal b = new Perro(); Animal c = new Gato(); Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al método hacerRuido() de cada ítem.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Animal> Animales = new ArrayList();

        Animal a = new Animal();
        Animales.add(a);
        Perro p = new Perro();
        Animales.add(p);
        Gato g = new Gato();
        Animales.add(g);

        for (Animal aux : Animales) {
            aux.hacerRuido();
        }

    }

}
