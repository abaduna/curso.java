package org.example.patronesDeDiseño.Factory;

import org.example.GarbageCollector.GarbageCollector;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.CreateShape("Circle");
        shape.draw();
    }
}
