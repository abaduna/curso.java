package org.example.patronesDeDiseño.Factory;

public class ShapeFactory {
    public Shape CreateShape(String type){
        if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("Square".equalsIgnoreCase(type)) {
            return  new Squere();
        }
        return null;
    }
}
