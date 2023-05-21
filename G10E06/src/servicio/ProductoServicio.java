/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class ProductoServicio {
//introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar

    Scanner leer = new Scanner(System.in);

    HashMap<String, Double> almacen = new HashMap();

    public void menu() {
        System.out.println("Ingrese una opción");
        System.out.println("1- agregar un producto");
        System.out.println("2- modificar el precio de un producto");
        System.out.println("3- eliminar un producto");
        System.out.println("4- mostrar los productos del almacen");
        System.out.println("5- salir");
        int var = leer.nextInt();
        switch (var) {
            case 1:
                agregarProduc();
                menu();
                break;
            case 2:
                modificarPrecio();
                menu();
                break;
            case 3:
                eliminarProduc();
                menu();
                break;
            case 4:
                mostrarProduc();
                menu();
                break;
            case 5:
                System.out.println("Gracia por utilizar la App");
                break;
            default:
                System.out.println("--------------");
                System.out.println("Valor inválido");
                System.out.println("--------------");
                menu();                
        }
    }

    public void agregarProduc() {
        char aux;
        do {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            Double precio = leer.nextDouble();
            Producto unProducto = new Producto(nombre, precio);
            almacen.put(unProducto.getNombre(), unProducto.getPrecio());
            System.out.println("Desea agregar otro producto? (s)");
            aux = leer.next().toLowerCase().charAt(0);
        } while (aux == 's');        
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el producto a modificar el precio");
        String nombre = leer.next();
        System.out.println("Ingrese el nuevo precio");
        Double precio = leer.nextDouble();
        almacen.replace(nombre, precio);
    }
    
    public void eliminarProduc(){
        System.out.println("Ingrese el producto a eliminar");
        String nombre = leer.next();
        almacen.remove(nombre);
        
    }
       
    public void mostrarProduc(){
        System.out.println(almacen);
    }
}
