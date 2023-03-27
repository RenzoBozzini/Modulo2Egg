/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
 * calcular su equivalente: 1 día, 2 horas.
 * @author RENZO
 */
public class G03EE01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double minutos,dias,horas;
        System.out.println("Ingrese la cantidad de minutos");
        minutos = leer.nextInt();
        
        dias = minutos / 1440;
        horas = (minutos-(Math.floor(dias)*1440)) / 60;
        
        System.out.println("La cantidad de días es: " + Math.floor(dias));
        System.out.println("La cantidad de horas es: " + Math.floor(horas));
        
    }
}
