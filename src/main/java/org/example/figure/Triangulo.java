package org.example.figure;

public class Triangulo extends Figura {
    double altura;
    double ancho;

    public double calcAltura(){
        double area =(altura*ancho)/2;
        return  area;
    }
}
