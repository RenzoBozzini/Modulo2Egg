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
public class Televisor extends Electrodomestico {
    protected int resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double precio, String color, char consumoElectrico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
   
    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
    */
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas de televisor");
        this.resolucion = leer.nextInt();
        System.out.println("Ingrese si tiene un sintonizadorTDT ture/false");
        this.sintonizadorTDT = leer.hasNextBoolean();
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
    */
    
    @Override
    public void precioFinal(){
        
        if (resolucion > 40) {
            this.precio = this.precio*1.3;
        }
        
        super.precioFinal();
        
        if (sintonizadorTDT) {
            this.precio = this.precio + 500;
        }
        
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
}
