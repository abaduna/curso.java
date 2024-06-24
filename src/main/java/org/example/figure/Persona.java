package org.example.figure;

import java.util.Objects;

public class Persona {
    public String nombre;
    public String telefono;

    public void mostrarDatos(){
        System.out.println(nombre + " "+ telefono);
    }
    public Persona(){
        System.out.println("se creo una persona ");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono);
    }
}
