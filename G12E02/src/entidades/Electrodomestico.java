/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoElectrico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoElectrico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F') {
            //setConsumoElectrico('F');
            this.consumoElectrico = 'F';
        }
    }

    public void comprobarColor(String color) {
        color = color.toUpperCase();
        if (!"BLANCO".equals(color) && !"NEGRO".equals(color) && !"ROJO".equals(color) && !"AZUL".equals(color) && !"GRIS".equals(color)) {
            this.color = "BLANCO";
        }

    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el color del electrodoméstico");
        this.color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese la letra que identifica la eficiencia energética del electrodoméstico");
        this.consumoElectrico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumoElectrico);
        System.out.println("Ingrese el peso del electrodoméstico");
        this.peso = leer.nextDouble();
        System.out.println("Ingrese el precio del electrodomestico");
        this.precio = leer.nextDouble();

    }

    public void precioFinal() {
        switch (Character.toUpperCase(this.consumoElectrico)) {
            case 'A':
                this.precio = this.precio + 1000.0;
                break;
            case 'B':
                this.precio = this.precio + 800.0;
                break;
            case 'C':
                this.precio = this.precio + 600.0;
                break;
            case 'D':
                this.precio = this.precio + 500.0;
                break;
            case 'E':
                this.precio = this.precio + 300.0;
                break;
            case 'F':
                this.precio = this.precio + 100.0;
                break;
        }
        
        if (this.peso >= 0.0 && this.peso <= 19.0) {
            this.precio = this.precio + 100.0;            
        }else if (this.peso >= 20.0 && this.peso <= 49.0) {
            this.precio = this.precio + 500.0;         
        }else if (this.peso >= 50.0 && this.peso <= 79.0) {
            this.precio = this.precio + 800.0; 
        }else if (this.peso >= 80.0) {
            this.precio = this.precio + 1000.0; 
        }
        
        
        
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + '}';
    }

    
    
}
