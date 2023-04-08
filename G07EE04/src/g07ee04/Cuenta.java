/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07ee04;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de 
 * realizar una transacción de retiro.
 *
 * @author RENZO
 */
public class Cuenta {

    private double saldo;
    private String titular;

   

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    

    public void retirar_dinero(double retiro) {
        if (retiro <= saldo) {
            System.out.println(this.getTitular() + " Su saldo es de: " + (this.saldo - retiro));
        } else {
            System.out.println("No tiene fondos suficientes");
        }
    }

    public String getTitular() {
        return titular;
    }
    
    
}
