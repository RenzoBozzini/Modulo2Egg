/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g08e01.Servicios;

import g08e01.Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 *
 * @author RENZO
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    //a) Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el numero de cuenta");
        int cuenta = leer.nextInt();
        System.out.println("Ingrese el DNI de cuenta");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo de la cuenta");
        double saldo = leer.nextDouble();

        CuentaBancaria c1 = new CuentaBancaria(cuenta, dni, saldo);

        return c1;
    }

    //b) Método ingresar(double): recibe una cantidad de dinero a ingresar y 
    //se le sumará al saldo actual.
    public void ingresaDinero(CuentaBancaria unaCuenta, double ingresoDinero) {
        double saldoTotal = unaCuenta.getSaldoActual() + ingresoDinero;
        unaCuenta.setSaldoActual(saldoTotal);
    }

    /*
    c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
     */
    public void retirarDinero(CuentaBancaria unaCuenta, double retiro) {
        if (unaCuenta.getSaldoActual() >= retiro) {
            double saldoActual = unaCuenta.getSaldoActual() - retiro;
            unaCuenta.setSaldoActual(saldoActual);
        } else {
            unaCuenta.setSaldoActual(0);
        }
    }

    /*
    d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
     */
    public void extraccionRapida(CuentaBancaria unaCuenta, double extraccion) {
        if (extraccion <= unaCuenta.getSaldoActual() * 0.2) {
            double saldoActual = unaCuenta.getSaldoActual() - extraccion;
            unaCuenta.setSaldoActual(saldoActual);
        } else {
            System.out.println("No se puede sacar mas de un 20% del saldo de la cuenta");
        }
    }
    /*
    e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
    */
   public void consultarSaldo(CuentaBancaria unaCuenta){
       System.out.println("El saldo de la cuenta es: "+unaCuenta.getSaldoActual());
          }
   
  /*
   f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
   */
   public void consultarDatos(CuentaBancaria unaCuenta){
       System.out.println("El numero de cuenta es: "+unaCuenta.getNumeroCuenta());
       System.out.println("El DNI de la cuenta es: "+unaCuenta.getDniCliente());
       System.out.println("El saldo de la cuenta es: "+unaCuenta.getSaldoActual());
   }
   

}
