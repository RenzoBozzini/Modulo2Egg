/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12e02;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RENZO
 */
public class G12E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        /*
        //---------------- GUIA 12 EJERCICIO 2 ----------------
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();
        
        System.out.println("---Se crea Lavadora---");
        l.crearLavadora();
        l.comprobarColor(l.getColor());
        l.comprobarConsumoEnergetico(l.getConsumoElectrico());
        l.precioFinal();
        
        System.out.println("---Se crea Televisor---");
        t.crearTelevisor();
        t.comprobarColor(t.getColor());
        t.comprobarConsumoEnergetico(t.getConsumoElectrico());
        t.precioFinal();
        
        System.out.println(l);
        System.out.println(t);        
        */
        
        /*
        ---------------- GUIA 12 EJERCICIO 3 ----------------
        
        Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
        */
        List<Electrodomestico> listaElec = new ArrayList();
        
        Lavadora l1 = new Lavadora(1200d, "verde", 'g', 100d, 60);
        Lavadora l2 = new Lavadora(1000d, "rojo", 'c', 30d, 20);
        Televisor t1 = new Televisor(1600d, "negro", 'b', 70d, 60, true);
        Televisor t2 = new Televisor(3000d, "azul", 'a', 20d, 40, false);
        
        listaElec.add(t1);
        listaElec.add(t2);
        listaElec.add(l1);
        listaElec.add(l2);
        
        double sumaPrecio = 0;
        
        System.out.println("Lista de electrodomesticos:");
        System.out.println("");
        for (Electrodomestico aux : listaElec) {           
            aux.comprobarColor(aux.getColor());
            aux.comprobarConsumoEnergetico(aux.getConsumoElectrico());
            aux.precioFinal();
            System.out.println(aux);         
            System.out.println("---------------------------");
            sumaPrecio = sumaPrecio + aux.getPrecio();
        }
        
        System.out.println("El valor total de la lista de electrodomesticos es :" + sumaPrecio);
        
    }
    
}
