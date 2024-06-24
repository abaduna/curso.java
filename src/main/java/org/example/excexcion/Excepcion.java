package org.example.excexcion;

import org.example.figure.Persona;
import org.example.singleton.JuegoHelper;

public class Excepcion {
    public static void main(String[] args)  {
      Usuario user = new Usuario();
      try {
          registar(user);
      }catch (IllegalAccessException e) {
          System.out.println(e.getMessage());

      }

    }
public  static void registar(Usuario user) throws IllegalAccessException {
    if (user.getEmail() == null) {
        throw new IllegalAccessException("el usario no tiene email");
    }
    System.out.println("registro");
}
}
class Usuario{
    private String email;
    private  String nombre;
    private  String telefono;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}