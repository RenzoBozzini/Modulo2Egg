/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g08e02;

import entidad.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

/**
 *
 * @author RENZO
 */
public class G08E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cafetera ofi = new Cafetera();
        CafeteraServicio ofiServicio = new CafeteraServicio();
        String val;
                
        System.out.println("Setee la capacidad maxima de cafe");
        ofi.setCapacidadMaxima(leer.nextDouble());
        System.out.println("La capacidad maxima seleccionada es:");
        System.out.println(ofi.getCapacidadMaxima());
        
        
        do {
           
            System.out.println("Menu");
        System.out.println("a. Sevir taza, ingrese la capacidad de la taza a servir");
        System.out.println("b. Vaciar Cafetera");
        System.out.println("c. Agregar Cafe");
        System.out.println("d. Llenar cafetera");
        System.out.println("e. Salir");
        val = leer.next();
        
        switch (val) {
            case "a":
                System.out.println("Ingrese la capacidad de la taza a servir");
                ofiServicio.servirTaza(ofi, leer.nextInt());
                break;
            case "b":
                ofiServicio.vaciarCafetera(ofi);
                break;
            case "c":
                System.out.println("Ingrese la cantidad de cafe a agregar");
                ofiServicio.agregarCafe(ofi, leer.nextInt());
                break;
            case "d":
                ofiServicio.llenarCafetera(ofi);
                System.out.println("La cantidad actual de cafe es: "+ofi.getCantidadActual());
                break;
            case "e":
                System.out.println("Gracias por usar la cafetera");
                break;
        }
            
        } while (!(val.equals("e")));
        
        
        
        
    }
    
}
