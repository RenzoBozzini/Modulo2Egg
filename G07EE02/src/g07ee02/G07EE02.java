/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07ee02;

import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class G07EE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Puntos p1 = new Puntos();
        
        System.out.println("Ingrese las coordenadas de los puntos: ");
        p1.crearPuntos(leer.nextDouble(), leer.nextDouble(), leer.nextDouble(), leer.nextDouble());
        
        System.out.println("La distancia entre los puntos es: " + p1.distanciaPuntos());
    }
    
}
