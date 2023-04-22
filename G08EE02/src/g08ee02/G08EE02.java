/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g08ee02;

import servicio.NifServicio;

/**
 *Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
con su correspondiente letra (NIF). Los atributos serán el número de DNI
(entero largo) y la letra (String o char) que le corresponde. En NIFService
se dispondrá de los siguientes métodos:
 * @author RENZO
 */
public class G08EE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NifServicio usuario = new NifServicio();
        usuario.crearNif();
        usuario.mostrar();
    }
    
}
