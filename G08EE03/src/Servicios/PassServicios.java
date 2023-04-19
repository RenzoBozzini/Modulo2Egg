/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class PassServicios {

    Scanner leer = new Scanner(System.in);

    public void ingresoDatosFijos(Pass usuario) {
        usuario.setPass("contraseña123");
        usuario.setNombre("Renzo");
        usuario.setDni(32333444);
    }

    public void crearPass(Pass usuario) {
        String nuevoPass;
        do {
            System.out.println("Ingrese la contraseña");
            nuevoPass = leer.next();
            if (nuevoPass.length() == 10) {
                usuario.setPass(nuevoPass);
            } else {
                System.out.println("Debe ingresar un pass de 10 digitos");
            }
        } while (!(nuevoPass.length() == 10));
    }

    public void analizarPass(Pass usuario) {
        int contadorZ = 0;
        int contadorA = 0;

        for (int i = 0; i < usuario.getPass().length(); i++) {
            if (usuario.getPass().contains("z")) {
                contadorZ++;
            }
        }
        for (int j = 0; j < usuario.getPass().length(); j++) {
            if (usuario.getPass().contains("a")) {
                contadorA++;
            }
        }
        if (contadorZ >= 1 && contadorA >= 2) {
            System.out.println("La contraseña es nivel ALTO");
        }else if(contadorZ >= 1){
            System.out.println("La contraseña es nivel MEDIO");
        }else{
            System.out.println("Su nivel de contraseña es Bajo");
        }
    }
    
    public void modificaNombreDni(Pass usuario){
        System.out.println("Ingrese contraseña");
        String otroPass = leer.next();
        if (usuario.getPass().equals(otroPass)) {
            System.out.println("Ingrese el nuevo nombre");
            usuario.setNombre(leer.next());
            System.out.println("Ingrese el nuevo dni");
            usuario.setDni(leer.nextInt());
        }
        
    }

}
