/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class PerroServicio {

    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    private ArrayList<Perro> listaDePerros; // creo la lista de perros

    //Esta es una muy buena practica
    public PerroServicio() {
        this.leer = new Scanner(System.in); // Cuando se invoca la clase, habilita el flujo de datos
        this.listaDePerros = new ArrayList<>(); // Creo el espacio en memoria del LISTA
    }

    //Metodo para que el usuario carague los DATOS de forma manual
    public void cargarListaDePerros() {
        String aux;
        do {
            System.out.println("Ingrese la raza del perro");
            String raza = leer.next();
            raza = raza.toLowerCase();
            listaDePerros.add(new Perro(raza));
            System.out.println("Desea cargar otro perro? (s)");
            aux = leer.next();
        } while (aux.equals("s"));
    }

    //Metodo para imprimir lista
    public void imprimirLista() {
        for (Perro variable : listaDePerros) {
            System.out.println(variable.toString());
        }
    }

    //Ingreso una raza, busco y elimino
    public void buscoYelimino(String r) {
        // Uso el iterador, porque si uso FOREACH da error
        Iterator<Perro> ite = listaDePerros.iterator();
        while (ite.hasNext()) {
            if (ite.next().getRaza().equals(r)) {
                ite.remove();
            }
        }
    }

    public void ordenaRazas() {
        //Estructura modelo
        //Collections.sort(NombreLista, 
        //(ClaseAtributos objeto1, ClaseAtributos objeto2) -> objeto1.getAtriutoPaComparar().compareTo(objeto2.getAtriutoPaComparar()));
        Collections.sort(listaDePerros,(Perro objeto1, Perro objeto2) -> objeto1.getRaza().compareTo(objeto2.getRaza()));

    }

}
