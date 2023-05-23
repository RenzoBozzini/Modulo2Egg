package servicio;

import entidad.Carta;
import entidad.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Servicio {
    
    List <Carta> mazo = new ArrayList<>();
    List <Carta> descarte = new ArrayList<>();
    
    public void armarMazo(List <Carta> mazo){
        
            for (int j = 0; j < 12; j++) {
                if (j < 8 || j > 9) {
                    
              
                    mazo.add(new Carta(j+1, Palos.BASTO));
                    mazo.add(new Carta(j+1, Palos.ESPADA));
                    mazo.add(new Carta(j+1, Palos.ORO));
                    mazo.add(new Carta(j+1, Palos.COPA));
                    
                }
            }
                    
    }
    
    public void barajar() {
        armarMazo(mazo);
        Collections.shuffle(mazo);        
    }

    public void siguienteCarta() {
        Carta e = mazo.remove(0);
        descarte.add(e);
        System.out.println("La carta es:" + e);
    }

    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas por repartir es: " + mazo.size());
    }

    public void darCartas(int cant) {
        if (cant < mazo.size()) {
            for (int i = 0; i < cant; i++) {
                siguienteCarta();
                
            }
        }else{
            System.out.println("No hay mas cartas en el mazo");
        }    
        System.out.println("Se dieron " + cant + " cartas");
        
    }

    public void cartasMonton() {
        if (mazo.size() == 40) {
            System.out.println("No entrego cartas");            
        }else{
            System.out.println("Las cartas que saliero son:");
            System.out.println(descarte);
        }
    }

    public void mostrarBaraja() {
        System.out.println(mazo);
    }
}
