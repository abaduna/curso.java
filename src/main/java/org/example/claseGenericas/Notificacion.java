package org.example.claseGenericas;

public class Notificacion<T> {
    private  T objeto;
    public  Notificacion(T objeto ){
        this.objeto = objeto;

    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
