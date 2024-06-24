package org.example.GarbageCollector;

import org.example.Landa.Person;

public class GarbageCollector {
    private String var1;
    private  String var2;

    public  void example(){
        Integer a = 123;
        Person p = new Person();
        p.setSalario(500f);
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }
}
