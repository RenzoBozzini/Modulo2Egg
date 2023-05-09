/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10e02;

import java.util.Scanner;
import servicio.PerroServicio;

/**
 *Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 * @author RENZO
 */
public class G10E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PerroServicio ps = new PerroServicio();
        ps.cargarListaDePerros();
        ps.imprimirLista();
        System.out.println("Ingrese una raza a eliminar");
        ps.buscoYelimino(leer.next());
        ps.ordenaRazas();
        ps.imprimirLista();        
    }
    
}
