/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 * @author RENZO
 */
public class Cine {
    private boolean [][] capacidadSala; // matriz da la capacidad  de la sala.
    // matriz da la capacidad  de la sala.
    private Pelicula unaPeli;
    private double precio;

    public Cine() {
        this.capacidadSala = new boolean [8][6];
    }

    public Cine(Pelicula unaPeli, double precio) {
        this.capacidadSala = new boolean [8][6];
        this.unaPeli = unaPeli;
        this.precio = precio;
    }

    public boolean[][] getCapacidadSala() {
        return capacidadSala;
    }

    public void setCapacidadSala(boolean[][] capacidadSala) {
        this.capacidadSala = capacidadSala;
    }

    public Pelicula getUnaPeli() {
        return unaPeli;
    }

    public void setUnaPeli(Pelicula unaPeli) {
        this.unaPeli = unaPeli;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "unaPeli=" + unaPeli + ", precio=" + precio + '}';
    }


    
    

    

    
    
}
