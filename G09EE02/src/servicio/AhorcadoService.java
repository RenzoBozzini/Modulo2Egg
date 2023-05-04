/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
    palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y 
    el valor que ingresó el usuario.
     */
    public void crearJuego(Ahorcado unJugador) {
        System.out.println("Ingrese la palabra para jugar al ahorcado");
        String palabIngre = leer.next();

        String[] p = new String[palabIngre.length()];
        for (int i = 0; i < palabIngre.length(); i++) {
            p[i] = palabIngre.substring(i, i + 1);
        }

        unJugador.setPalabra(p);
        System.out.println("Ingrese la cantidad de jugadas máximas");
        unJugador.setJugadasMax(leer.nextInt());
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
     */
    public int longitud(Ahorcado j) {
        return j.getPalabra().length;
    }

    /*
    Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
     */
    public boolean buscar(Ahorcado j, String c) {
        boolean encontrada = false;
        for (int i = 0; i < longitud(j); i++) {
            if (j.getPalabra()[i].equals(c)) {
                encontrada = true;
            }
        }       
        return encontrada;
    }
    /*
    Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
     */
    
    public boolean encontradas(Ahorcado j,String l){
        
        for (int i = 0; i < longitud(j); i++) {
            if (j.getPalabra()[i].equals(l)) {
                j.setCantLetEncon(j.getCantLetEncon()+1);
                System.out.print(l);
            }else{
                System.out.print(" _ ");
            }
        }
        System.out.println("");
        System.out.println("Se encontraron: "+j.getCantLetEncon()+" letras");
        System.out.println("Te faltan encontrar: "+(longitud(j)-j.getCantLetEncon())+" letras");
        if (!buscar(j, l)) {
            j.setJugadasMax(j.getJugadasMax()-1);
        }        
        return buscar(j, l);        
    }    
    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
    */
    public int intentos(Ahorcado j){
        return j.getJugadasMax();
    }
    /*
    Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
    */
    public void juego(){
        Ahorcado j = new Ahorcado();
        crearJuego(j);
        do {
            System.out.println("Ingrese la letra a buscar");
            encontradas(j, leer.next());
            System.out.println("Intentos disponibles: "+j.getJugadasMax());
            if (j.getCantLetEncon()==longitud(j)) {
                System.out.println("Ganaste");
                break;
            }
        } while (j.getJugadasMax()>=1);
        
        if (j.getCantLetEncon()< longitud(j)) {
            System.out.println("Perdiste");
        }        
    }

}
