/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 * @author RENZO
 */
public class Juego {
    Scanner leer = new Scanner(System.in);
    private List<Jugador> jugadores;
    private Revolver r;
    
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        System.out.println("Ingrese el numero de jugadores (de 2 a 6)");
        int cant = leer.nextInt();
        if (cant < 2) {
            cant = 2;
        } else if(cant > 6){
            cant = 6;
        }
        Jugador j = new Jugador();
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del jugador");
            j.setNombre(leer.next());
            j.setId(i+1);
            jugadores.add(j);            
        }
        r.llenarRevolver();
        System.out.println(jugadores.toString());
    }
    
    public void ronda(ArrayList<Jugador>jugadores){
        //System.out.println(jugadores.toString());
        for (Jugador player : jugadores) {            
            if (player.disparo(r)) {
                System.out.println("El jugador mojado es:");
                System.out.println(player);
                break;
            }else{
                ronda(jugadores);
            }
        }
        
    }
    
    
    
    
}
