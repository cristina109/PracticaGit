/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

/**
 *
 * @author dam117
 */
public class Triangulo extends Figura{
    float altura;
    float lado;
    
    public Triangulo(float altura, float lado, Colores color) {
        this.altura = altura;
        this.lado = lado;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "altura=" + altura + ", lado=" + lado + ", color=" + color + '}';
    }

    public double area() {
        return this.altura * this.lado /2;
    }

    public double perimetro() {
        return this.lado * 3;
    }
    
}
