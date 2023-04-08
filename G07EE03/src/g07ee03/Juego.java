/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07ee03;

import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a 
 * dos jugadores jugar un juego de adivinanza de números. El primer 
 * jugador elige un número y el segundo jugador intenta adivinarlo. El segundo 
 * jugador tiene un número limitado de intentos y recibe una pista de "más alto" 
 * o "más bajo" después de cada intento. El juego termina cuando el segundo jugador 
 * adivina el número o se queda sin intentos. Registra el número de intentos 
 * necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * @author RENZO
 */
public class Juego {

    private int num1;
    private int num2;
    private int intentos;
    private int jugador1; //contador de juegos ganados
    private int jugador2; 

    public Juego() {
    }

    public Juego(int num1, int num2, int intentos) {
        this.num1 = num1;
        this.num2 = num2;
        this.intentos = intentos;
        this.jugador1 = 0;
        this.jugador2 = 0;
    }

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }
    
    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1 ingrese un numero: ");
        this.num1 = leer.nextInt();
        System.out.println("Ingrese la cantidad de intentos que tendrá el jugador 2");
        this.intentos = leer.nextInt();
        int contador = 0;

        do {
            contador++;
            System.out.println("Jugador 2 ingrese un numero: ");
            this.num2 = leer.nextInt();
            if (num1 == num2) {
                System.out.println("El jugador 2 gana ya que le pegó al numero!");
                this.jugador2++;
                break;
            } else if (num2 > num1) {
                System.out.println("El numero a adivinar es menor!");

            } else if (num2 < num1) {
                System.out.println("El numero a adivinar es mayor!");
            }
        } while (contador < this.intentos); //2

        if (contador == this.intentos) {
            System.out.println("Te quedaste sin intentos ganó el jugador 1");
            this.jugador1++;
        }
    }
}



