package org.example.inmutabilidad;


import static org.example.inmutabilidad.Persona.Builder.aPersona;

public class Inmutabilidad {
    public void main(){
        //Persona personaaa = new Persona("3413592493","arturo baduna","df@gmail.com");
        //personaaa.getEmail();
        Persona persona = aPersona()
                .withEmail("A@gmail.com")
                .withNombre("artru")
                .withTelefono("64656")
                .build();


    }


}
