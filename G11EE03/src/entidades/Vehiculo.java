/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 * @author RENZO
 */
public class Vehiculo {
    private String marca, modelo;
    private int anio, motor, chasis;
    private Tipo_vehiculo tipo;
    private Color_vehiculo color;
    private Cliente unCliente;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, int motor, int chasis, Tipo_vehiculo tipo, Color_vehiculo color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.chasis = chasis;
        this.tipo = tipo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public Tipo_vehiculo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_vehiculo tipo) {
        this.tipo = tipo;
    }

    public Color_vehiculo getColor() {
        return color;
    }

    public void setColor(Color_vehiculo color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", motor=" + motor + ", chasis=" + chasis + ", tipo=" + tipo + ", color=" + color + '}';
    }
    
    
    
    
    
}
