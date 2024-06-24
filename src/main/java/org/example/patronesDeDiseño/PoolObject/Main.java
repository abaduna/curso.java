package org.example.patronesDeDiseño.PoolObject;

import org.example.patronesDeDiseño.Factory.Shape;
import org.example.patronesDeDiseño.Factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        EmenyPool emenyPool = new EmenyPool();
        emenyPool.createOrcs(6);
        emenyPool.getOrcs();
    }
}
