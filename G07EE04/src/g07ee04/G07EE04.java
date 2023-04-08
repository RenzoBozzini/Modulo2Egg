/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07ee04;

import java.util.Scanner;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de 
 * realizar una transacción de retiro.
 * @author RENZO
 */
public class G07EE04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese saldo y titular de la cuenta");
        Cuenta nuevaCuenta = new Cuenta(leer.nextDouble(),leer.next());
        System.out.println("Ingrese el dinero a retirar");
        nuevaCuenta.retirar_dinero(leer.nextDouble());
     
        
                
    }
    
}
