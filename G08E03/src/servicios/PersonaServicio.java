/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona fulano) {
        return (fulano.getEdad() >= 18);
    }

    public Persona crearPersona() {
        Persona fulano = new Persona();
        
        System.out.println("Ingresar nombre");
        fulano.setNombre(leer.next());
        System.out.println("Ingrese edad");
        fulano.setEdad(leer.nextInt());
        String aux;
        
        do {
            System.out.println("Ingrese sexo h,m,o (si no ingresa correctamente se le volverá a pedir)");
            aux = leer.next();
            if (aux.equals("h") || aux.equals("m") || aux.equals("o")) {
                fulano.setSexo(aux);
            }          
        } while (!(aux.equalsIgnoreCase("h") || aux.equalsIgnoreCase("m") || aux.equalsIgnoreCase("o")));
        
        System.out.println("Ingrese peso");
        fulano.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura");
        fulano.setAltura(leer.nextDouble());
        return fulano;
    }

    public int calcularIMC(Persona fulano) {
        double imc = fulano.getPeso() / (Math.pow(fulano.getAltura(), 2));
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public void porcentajes (Persona[] fulano){
        PersonaServicio aux = new PersonaServicio();
        
        System.out.println("El porcentaje de personas bajo de peso son: ");
        int bajoPeso = 0;
        int enForma = 0;
        int altoPeso = 0;
        for (int i = 0; i < fulano.length; i++) {
            if (aux.calcularIMC(fulano[i]) < 1) {
                bajoPeso++;
            }else if (aux.calcularIMC(fulano[i]) >= 1) {
                enForma++;
            }else{
                altoPeso++;
            }        
        }
        System.out.println("Promedios:");
        System.out.println("Bajo peso: "+ (bajoPeso/fulano.length)*100);
        System.out.println("En forma: "+ (enForma/fulano.length)*100);
        System.out.println("Alto peso: "+ (altoPeso/fulano.length)*100);
        
        int mayores = 0;
        int menores = 0;
        for (int i = 0; i <= fulano.length; i++) {
            if (aux.esMayorDeEdad(fulano[i])) {
                mayores++;
            }else{
                menores++;
            }        
        }
        
        System.out.println("Promedios:");
        System.out.println("Mayores: "+ (mayores/fulano.length)*100);
        System.out.println("Menores: "+ (menores/fulano.length)*100);
                
    }
    
}
