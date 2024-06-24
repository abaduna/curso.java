package org.example.optional;

import org.example.figure.Persona;

public class Optional<P> {
    public static  void main(){
        Optional<Persona> cliente = getCliente(1);

        System.out.println(cliente);
    }
    public static Optional<Persona> getCliente(int id){
        return null;
    }
}
