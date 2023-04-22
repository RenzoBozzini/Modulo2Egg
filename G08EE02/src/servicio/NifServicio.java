/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class NifServicio {

    /*
    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según
     */
    Scanner leer = new Scanner(System.in);
    Nif usuario = new Nif();

    public void crearNif() {
        System.out.println("Ingrese su DNI");
        usuario.setDni(leer.nextLong());
        usuario.setLetra(calculoLetra());
    }

    public char calculoLetra() {
        int resto = (int) (usuario.getDni() % 23);
        char[] vectorLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return vectorLetras[resto];
    }
    /*
    Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).    
    */
    public void mostrar(){
        System.out.println("El NIF es: "+usuario.getDni()+"-"+usuario.getLetra());
    }

}
