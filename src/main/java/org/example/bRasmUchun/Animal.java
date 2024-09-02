package org.example.bRasmUchun;

public  abstract class Animal {

    private String name;

    public Animal(){
    }

    public Animal(String name) {
        this.name = name;
    }

    public void  sound(){
    }

    public String getName() {
        return name;
    }
}
