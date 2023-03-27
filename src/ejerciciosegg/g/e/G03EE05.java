/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios: ○ Los socios tipo ‘A’ abonan una
 * cuota mayor, pero tienen un 50% de descuento en todos los tipos de
 * tratamientos. ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
 * de descuento para los mismos tratamientos que los socios del tipo A. ○ Los
 * socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos. ○ Solicite una letra (carácter) que representa la clase de un
 * socio, y luego un valor real que represente el costo del tratamiento (previo
 * al descuento) y determine el importe en efectivo a pagar por dicho socio.
 *
 * @author RENZO
 */
public class G03EE05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clase;
        double descuento,monto;
        descuento = 1;
        

        do {
           System.out.println("Ingrese la clase de su obra social (a, b o c)");
        clase = leer.next();
        clase = clase.toLowerCase(); 
            switch (clase) {
                case "a":
                    descuento = 1-0.5;
                    break;
                case "b":
                    descuento = 1-0.35;
                    break;
                case "c":
                    descuento = 1;
                    break;
                default:
                    System.out.println("Elegiste una clase erronea!");
            }
        } while (!clase.equals("a") || !clase.equals("a") || !clase.equals("a"));
        
        System.out.println("Ingrese el monto sin descuento del medicamento");
        monto = leer.nextDouble();
        System.out.println("Dada la clase de su obra social deberá pagar: " + (monto*descuento));

    }
}
