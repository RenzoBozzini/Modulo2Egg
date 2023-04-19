/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Cafetera;

/**
 *
 * @author RENZO
 */
public class CafeteraServicio {
    
    public void llenarCafetera(Cafetera unaCafetera){
        unaCafetera.setCantidadActual(unaCafetera.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera unaCafetera, int capacidadTaza){
        if (unaCafetera.getCantidadActual()<capacidadTaza) {
            System.out.println("No hay cafe suficiente");
            System.out.println("Se llenó hasta: "+unaCafetera.getCantidadActual());
        }else {
            System.out.println("La taza se lleno!");
            unaCafetera.setCantidadActual(unaCafetera.getCantidadActual()-capacidadTaza);
        }
    }
    
    public void vaciarCafetera(Cafetera unaCafetera){
        unaCafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera unaCafetera,int cantidadCafe){
        unaCafetera.setCantidadActual(unaCafetera.getCantidadActual()- cantidadCafe);
    }
    
}
