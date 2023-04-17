/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g08e01;

import g08e01.Entidades.CuentaBancaria;
import g08e01.Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class G08E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String var;

        /*
        b) Método ingresar
c) Método retirar(double)
d) Método extraccionRapida:
e) Método consultarSaldo: 
f) Método consultarDatos: 
         */
        
        
        CuentaBancariaServicio c1 = new CuentaBancariaServicio(); //hay que instancias servicios para usar los metodos de servicio
        CuentaBancaria nuevaCuenta = c1.crearCuenta();
        do {
            System.out.println("Menu:");
            System.out.println("a. Ingresar dinero");
            System.out.println("b. Retirar Dinero");
            System.out.println("c. Extraccion rápida");
            System.out.println("d. Consultar saldo");
            System.out.println("e. Consultar datos");
            System.out.println("f. Salir");
            var = leer.next();
            
            switch (var) {
                case "a":
                    System.out.println("Ingrese el monto de dinero a depositar");
                    c1.ingresaDinero(nuevaCuenta, leer.nextDouble());
                    break;
                case "b":
                    System.out.println("Ingrese el monto de dinero a retirar");
                    c1.retirarDinero(nuevaCuenta, leer.nextDouble());
                    break;
                case "c":
                    System.out.println("Ingrese el monto de dinero a retirar en extraccion rápida");
                    c1.extraccionRapida(nuevaCuenta, leer.nextDouble());
                    break;
                case "d":
                    c1.consultarSaldo(nuevaCuenta);
                    break;
                case "e":
                    System.out.println("Los datos de la cuenta son: ");
                    c1.consultarDatos(nuevaCuenta);
                    break;
                case "f":
                    System.out.println("Gracias por utilizar el cajero");
                    break;
                default:
                    System.out.println("Opcion no válida");;
            }

        } while (!var.equals("f"));

    }

}
