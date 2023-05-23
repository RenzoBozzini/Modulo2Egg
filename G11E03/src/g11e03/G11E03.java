/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11e03;

import java.util.Scanner;
import servicio.Servicio;

/**
 *
 * @author RENZO
 */
public class G11E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servicio s = new Servicio();
        Scanner leer = new Scanner(System.in);
        s.barajar();
        s.siguienteCarta();
        s.cartasMonton();
        System.out.println("Cuantas cartas quiere?");
        s.darCartas(leer.nextInt());
        s.cartasDisponibles();
        
        
        
    }
    
}
