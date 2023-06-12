/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Cliente;
import entidades.Color_vehiculo;
import entidades.FormaPago;
import entidades.Poliza;
import entidades.TipoCobertura;
import entidades.Tipo_vehiculo;
import entidades.Vehiculo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Cliente unCliente;
    private Vehiculo unVehiculo;
    private Poliza unaPoliza;
    Tipo_vehiculo tipo;
    Color_vehiculo color;
    
    
    

    public void llenarPoliza() {
        System.out.println("Ingrese el numero de la poliza");
        //int numPoliza = leer.nextInt();
        int numPoliza = 2023001;
        System.out.println(numPoliza);
        System.out.println("Ingrese numero de cuotas de la poliza");
        //int cuotasPoliza = leer.nextInt();
        int cuotasPoliza = 6;
        System.out.println(cuotasPoliza);
        System.out.println("Fecha de inicio (hoy)");
        Date fechaInicio = new Date(2023+1900, 6, 4);
        System.out.println(fechaInicio);
        System.out.println("Fecha de fin (en 6 meses)");
        Date finPoliza= new Date(2023+1900, 12, 4);
        System.out.println(finPoliza);
        System.out.println("Ingrese la forma de pago");
        //String aux2 = leer.next();
        //FormaPago formaDePago = FormaPago.valueOf(aux2);
        FormaPago formaDePago = FormaPago.DEBITO;
        System.out.println(formaDePago);
        System.out.println("Ingrese el monto asegurado");
        //long montoAsegurado = leer.nextLong();
        long montoAsegurado = 3500000;
        System.out.println(montoAsegurado);
        System.out.println("Desea cobertura de granizo? (true/false)");
        //boolean granizo = leer.hasNextBoolean();
        boolean granizo = true;
        System.out.println(granizo);
        System.out.println("Ingrese el monto asegurado por granizo");
        //long montoGranizo = leer.nextLong();
        long montoGranizo = 1000000;
        System.out.println(montoGranizo);
        System.out.println("Ingrese el tipo de cobertura");
        //String aux3 = leer.next();
        //TipoCobertura unaCobertura = TipoCobertura.valueOf(aux3);
        TipoCobertura unaCobertura = TipoCobertura.TERCEROS;
        System.out.println(unaCobertura);
        
        System.out.println("Cargue el cliente de la poliza");
        Cliente clienteDePoliza = llenarCliente();
        System.out.println(clienteDePoliza);
                
        System.out.println("Cargue el vehiculo del cliente");
        Vehiculo vehiculoDePoliza = llenarVehiculo();
        System.out.println(vehiculoDePoliza);
                
    }

    public Cliente llenarCliente() {
        System.out.println("Ingrese el nombre del asegurado");
        //String nombre = leer.next();
        String nombre = "Juan";
        System.out.println("Ingrese el apellido");
        //String apellido = leer.next();
        String apellido = "Perez";
        System.out.println("Ingrese dni");
        //int dni = leer.nextInt();
        int dni = 30222444;
        System.out.println("Ingrese mail");
        //String mail = leer.next();
        String mail = "juanperez@gmail.com";
        System.out.println("Ingrese domicilio");
        //String domicilio = leer.next();
        String domicilio = "Alvear 913";
        System.out.println("Ingrese tel");
        //int tel = leer.nextInt();
        int tel = 155306780;
        unCliente = new Cliente(nombre, apellido, dni, mail, domicilio, tel);
        return unCliente;
    }

    public Vehiculo llenarVehiculo() {
        System.out.println("Ingrese la marca del vehiculo");
        //String marca = leer.next();
        String marca = "Ford";
        System.out.println("Ingrese modelo");
        //String modelo = leer.next();
        String modelo = "Fiesta";
        System.out.println("Ingreso el año");
        //int anio = leer.nextInt();
        int anio = 2020;
        System.out.println("Ingrese el nuemro de motor");
        //int motor = leer.nextInt();
        int motor = 998877123;
        System.out.println("Ingres el numero de Chasis");
        //int chasis = leer.nextInt();
        int chasis = 111456798;
        System.out.println("Ingrese el tipo de vehiculo");
        //String aux = leer.next();
        //tipo = Tipo_vehiculo.valueOf(aux);
        tipo = Tipo_vehiculo.AUTO;
        System.out.println("Ingrese el color de vehiculo");
        //String aux1 = leer.next();
        //color = Color_vehiculo.valueOf(aux1);
        color = Color_vehiculo.BLANCO;
               
        unVehiculo = new Vehiculo(marca, modelo, anio, motor, chasis, tipo, color);
        return unVehiculo;
}

}
