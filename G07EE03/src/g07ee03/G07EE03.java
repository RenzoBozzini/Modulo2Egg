/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07ee03;

import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class G07EE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String aux;

        Juego juegoNuevo = new Juego();

        do {
            juegoNuevo.iniciar_juego();

            System.out.println("El jugador 1 gano: " + juegoNuevo.getJugador1() + " veces");
            System.out.println("El jugador 2 gano: " + juegoNuevo.getJugador2() + " veces");
            System.out.println("Desea la revancha? s/n");
            aux = leer.next();
        } while (aux.equals("s"));
    }
}
