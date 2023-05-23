/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Random;

/**
 *Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 * @author RENZO
 */
public class Revolver {
    private int posActual;
    private int posAgua;
    
    public void llenarRevolver(){
        Random random = new Random();
        this.posActual= random.nextInt(6) + 1;
        this.posAgua = random.nextInt(6) + 1;
    }
    
    public boolean mojar(){
        return (this.posActual == this.posAgua);
    }
    
    public void siguienteChorro(){
        if (this.posActual == 6) {
            this.posActual = 1;            
        } else{
            this.posActual++;
        }        
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
      
            
}
