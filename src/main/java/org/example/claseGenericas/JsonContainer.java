package org.example.claseGenericas;

public class JsonContainer<T> {
    T object;
    public  JsonContainer(T objet){

    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
    public String getJson(){
        return null ;
    }
}
