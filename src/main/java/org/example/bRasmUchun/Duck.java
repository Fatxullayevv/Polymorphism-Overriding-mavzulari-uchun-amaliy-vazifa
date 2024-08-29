package org.example.bRasmUchun;

public class Duck extends Animal{

    public  Duck(){}
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " Ovozi: Quack! Quack!");
    }
}
