/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g09ee02;

import entidad.Ahorcado;
import java.util.Scanner;
import servicio.AhorcadoService;

/**
 *
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), 
 * la cual deberá contener como atributos, un vector con la palabra a buscar, 
 * la cantidad de letras encontradas y la cantidad jugadas máximas que puede 
 * realizar el usuario. Definir los siguientes métodos en AhorcadoService:

 * @author RENZO
 */
public class G09EE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        AhorcadoService as = new AhorcadoService();
        as.juego();
        
        
    }
    
}
