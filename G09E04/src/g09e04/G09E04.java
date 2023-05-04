/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g09e04;

import java.util.Date;
import servicios.FechaService;

/**
 *
 * @author RENZO
 */
public class G09E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FechaService fs = new FechaService();
        
        Date a = fs.fechaNacimiento();
        System.out.println("La diferrencia de años es");
        Date b = fs.fechaActual();
        System.out.println(Math.abs(fs.diferencia(a, b)));
    }
    
}
