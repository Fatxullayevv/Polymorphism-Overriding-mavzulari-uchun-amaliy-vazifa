package org.example.bRasmUchun;

public class Cat extends Animal{

    public Cat (){

    }
    public Cat(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " ovoz: Meow! Meow!");
    }
}
