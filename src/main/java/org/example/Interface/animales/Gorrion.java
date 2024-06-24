package org.example.Interface.animales;

public class Gorrion  extends  Ave implements Volador{
    @Override
    public void aletat() {
        System.out.println("i am alert");
    }

    @Override
    public void planear() {
        System.out.println("i am planing");
    }
}
