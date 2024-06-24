package org.example.Landa;
/*
*
*
* Person persona = new Person();
        persona.setEdad(5).setSalario(5000);
* */

public class Person {
    private String nombre;
    private float salario;
    private int edad;

    public float getSalario() {
        return salario;
    }

    public Person setSalario(float salario) {
        this.salario = salario;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Person setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Person setEdad(int edad) {
        this.edad = edad;
        return this;
    }
}
