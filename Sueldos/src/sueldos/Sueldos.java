/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import entidades.Vendedor;
import servicio.VendedorServicio;

/**
 * https://www.youtube.com/watch?v=_BXBluFObL0&ab_channel=EggCooperation
 * @author RENZO
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VendedorServicio vs = new VendedorServicio();
        Vendedor fulano1 = vs.altaVendedor();
        vs.sueldoMensual(fulano1);
        vs.vacaciones(fulano1);        
    }
    
}
