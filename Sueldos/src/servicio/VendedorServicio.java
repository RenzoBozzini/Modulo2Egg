/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class VendedorServicio {

    Scanner leer = new Scanner(System.in);

    public Vendedor altaVendedor() {
        // Instancio un objeto Vendedor
        Vendedor v1 = new Vendedor();
        // lleno los atributos del vendedor
        System.out.println("Ingrese nombre");
        v1.setNombre(leer.next());
        System.out.println("Ingrese DNI");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese sueldo basico");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese día de ingreso");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de ingreso");
        int mes = leer.nextInt();
        System.out.println("Ingrese año de ingreso");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    public void sueldoMensual(Vendedor v1) {
        System.out.println("Ingrese las ventas del vendedor");
        double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo mensual de " +v1.getNombre()
        + " es de $"+v1.getSueldoMensual());
    }
    
    public void vacaciones (Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear()-v1.getFechaInicio().getYear();
        
        if (antiguedad<5) {
            System.out.println("Le corresponden 14 dias de vacaciones");            
        }else if(antiguedad<10){
            System.out.println("Le corresponden 21 dias de vacaciones");
        }else if (antiguedad<20) {
            System.out.println("Le corresponden 28 dias de vacaciones");            
        }else if (antiguedad>20) {
            System.out.println("Le corresponden 35 dias de vacaciones");            
        }else{
            System.out.println("Tiene vacaciones proporcionales");
        }
    }
}
