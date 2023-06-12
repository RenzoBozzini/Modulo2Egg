/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11ee02;

import servicios.Simulacion;

/**
 *
 * @author RENZO
 */
public class G11EE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Simulacion s = new Simulacion();
        s.generarEspectadores();
        s.cargarPeli(); 
        s.llenadoSala();
              
        
    }
    
}
