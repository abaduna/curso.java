package org.example;



import org.example.figure.Persona;
import org.example.singleton.JuegoHelper;


public class Main {
    public static void main(String[] args) {
    Persona persona =  new Persona();
    Persona persona2 =  new Persona();
        JuegoHelper juegoHelper = new JuegoHelper();
        juegoHelper.setDificult(10);
    }

}