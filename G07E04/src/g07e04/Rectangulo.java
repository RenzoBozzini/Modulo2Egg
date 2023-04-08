/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07e04;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
 *
 * @author RENZO
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() { // si no generaba el constructor vacio me tiraba 
        //                   un caution en en nombre de los atributos.
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return (this.base * this.altura);
    }

    public double perimetro() { // no hace falta del this, parece....
        return (2 * base + 2 * altura);
    }

    public void dibijar() {
        for (int i = 1; i <= altura; i++) {
            System.out.println("");
            for (int j = 1; j <= base; j++) {
                if (i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }

    }
}
