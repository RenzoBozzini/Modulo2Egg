/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07e04;

import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class G07E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base de su rectangulo");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura de su rectangulo");
        double altura = leer.nextDouble();
        Rectangulo rec1 = new Rectangulo(base,altura);
        System.out.println("El area es: " + rec1.area());
        System.out.println("El perimetro es: " + rec1.perimetro());
        rec1.dibijar();
        
        
        
    }
    
    

}
