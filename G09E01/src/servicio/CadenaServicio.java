/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class CadenaServicio {

    /*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
     */
    Cadena oracion = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenado() {
        System.out.println("Ingrese frase");
        oracion.setFrase(leer.next());
    }

    public int mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < oracion.getLongitud(); i++) {
            char aux = oracion.getFrase().charAt(i);
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u') {
                contador++;
            }
        }
        return contador;
    }

    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
     */
    public void invertirFrase() {
        for (int i = (oracion.getLongitud() - 1); i >= 0; i--) {
            System.out.print(oracion.getFrase().charAt(i));
        }
        System.out.println("");
    }

    /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
     */
    public int vecesRepetido(char letra) {
        int cont = 0;
        for (int i = 0; i < oracion.getLongitud(); i++) {
            if (oracion.getFrase().charAt(i) == letra) {
                cont++;
            }
        }
        return cont;
    }

    /*
    Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
     */
    public void compararLongitud(String frase2) {
        int aux = oracion.getFrase().compareTo(frase2);

        if (aux == 0) {
            System.out.println("Las longitudes de cadenas son inguales");
        } else if (aux < 0) {
            System.out.println("La cadena 1 es mas corta");
        } else {
            System.out.println("La cadena 1 es mas larga");
        }
    }

    /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
     */
    public void unirFrases(String frase) {
        System.out.println(oracion.getFrase() + " " + frase);
    }

    /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
     */
    public void reemplazar(String letra) {
        String nuevaFrase = "";
        for (int i = 0; i < oracion.getLongitud(); i++) {
            char aux = oracion.getFrase().charAt(i);
            if (aux == 'a') {
                nuevaFrase = nuevaFrase + letra;
            } else {
                nuevaFrase = nuevaFrase + aux;
            }
        }
        oracion.setFrase(nuevaFrase);
        System.out.println(oracion.getFrase());
    }

    /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
     */

    public boolean contiene(char letra) {
        for (int i = 0; i < oracion.getLongitud(); i++) {
            char aux = oracion.getFrase().charAt(i);
            if (aux == letra) {
                return true;
            }
        }
        return false;
    }
}
