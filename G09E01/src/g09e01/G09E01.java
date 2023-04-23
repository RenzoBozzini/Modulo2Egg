/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g09e01;

import entidad.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 * @author RENZO
 */
public class G09E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        
        cs.llenado();
        System.out.println("Cant. de vocales: " + cs.mostrarVocales());
        System.out.println("Frase invertida: ");
        cs.invertirFrase();
        System.out.println("Ingrese un caracter y le diremos cuantas veces se repite");
        System.out.println("Se contabilizan: "+cs.vecesRepetido(leer.next().charAt(0)));
        System.out.println("Ingrese otra cadena para comparar longitudes");
        cs.compararLongitud(leer.next());
        System.out.println("Ingrese otra frase para agregar a la frase inicial");
        cs.unirFrases(leer.next());
        System.out.println("Ingrese una letra que reemplazará a la letra a dentro de la frase original");
        cs.reemplazar(leer.next());
        System.out.println("Ingrese una letra y le diremos si esta dentro de la frase");
        System.out.println(cs.contiene(leer.next().charAt(0)));
        
    }
    
}
