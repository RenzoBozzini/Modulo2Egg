/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), 
 * la cual deberá contener como atributos, un vector con la palabra a buscar, 
 * la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar 
 * el usuario. Definir los siguientes métodos en AhorcadoService:

 * @author RENZO
 */
public class Ahorcado {
    
    private String [] palabra;
    private int cantLetEncon;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetEncon, int jugadasMax) {
        this.palabra = palabra;
        this.cantLetEncon = cantLetEncon;
        this.jugadasMax = jugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetEncon() {
        return cantLetEncon;
    }

    public void setCantLetEncon(int cantLetEncon) {
        this.cantLetEncon = cantLetEncon;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
   
}
