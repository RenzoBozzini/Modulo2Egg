/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07e01;

import Entidad.Libro;
import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 * @author RENZO
 */
public class G07E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Libro BlancaNieves = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        int isbn = leer.nextInt();
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de pagina del libro");
        int numPag = leer.nextInt();
        
        BlancaNieves.cargarLibro(isbn, titulo, autor, numPag);
        BlancaNieves.leerLibro();
    }
    
}
