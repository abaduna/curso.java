package org.example.inmutabilidad;
//@Builder //lombok
  class Persona {
    private String telefono;
    private String email;
    private String nombre;



    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public Persona(String telefono, String nombre, String email) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
    }

      public static final class Builder {
          private String email;
          private String telefono;
          private String nombre;

          private Builder() {
          }

          public static Builder aPersona() {
              return new Builder();
          }

          public Builder withEmail(String email) {
              this.email = email;
              return this;
          }

          public Builder withTelefono(String telefono) {
              this.telefono = telefono;
              return this;
          }

          public Builder withNombre(String nombre) {
              this.nombre = nombre;
              return this;
          }

          public Persona build() {
              return new Persona(telefono, nombre, email);
          }
      }
  }
