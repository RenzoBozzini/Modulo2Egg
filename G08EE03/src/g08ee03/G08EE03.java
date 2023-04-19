/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g08ee03;

import Entidades.Pass;
import Servicios.PassServicios;
import java.util.Scanner;

/**
 * través de un menú de opciones: o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una contraseña valida). o B) Mensaje al usuario que tipo de NIVEL es su contraseña o C) Modificar contraseña, donde primero debe poner su contraseña anterior para dar permiso o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso, SINO impedir cambios o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso, SINO impedir cambios
 *
 * @author RENZO
 */
public class G08EE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Pass user1 = new Pass();
        PassServicios ps = new PassServicios();
        String val;

        do {
            System.out.println("Menu");
            System.out.println("a. Ingrese la contraseña");
            System.out.println("b. Le decimos el nivel de la contraseña");
            System.out.println("c. Modificar contraseña");
            System.out.println("d. Modificar nombre y dni");
            System.out.println("s. Salir");
            val = leer.next();
            switch (val) {
                case "a":
                    ps.ingresoDatosFijos(user1);
                    break;
                case "b":
                    ps.analizarPass(user1);
                    break;
                case "c":
                    ps.crearPass(user1);
                    break;
                case "d":
                    ps.modificaNombreDni(user1);
                    break;
            }
        } while (!(val.equals("s")));
    }
}
