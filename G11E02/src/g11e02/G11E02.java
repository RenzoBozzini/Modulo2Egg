/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11e02;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RENZO
 */
public class G11E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego game = new Juego();
        List <Jugador> jugadores = new ArrayList();
        Revolver r = new Revolver();
        game.llenarJuego((ArrayList<Jugador>) jugadores, r);
        game.ronda((ArrayList<Jugador>) jugadores);
                
    }
    
}
