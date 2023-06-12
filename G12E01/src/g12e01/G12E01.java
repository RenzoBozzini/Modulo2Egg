/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12e01;

/**
 *
 * @author RENZO
 */
public class G12E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal p1 = new Perro("Stich", "Carne", 15, "Doberman");
        p1.alimentarse();
        
        Animal p2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        p2.alimentarse();
        
        Animal g1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        g1.alimentarse();
        
        Animal c1 = new Caballo("Spark", "Pasto", 25, "Fino");
        c1.alimentarse();
        
        
        
        
    }
    
}
