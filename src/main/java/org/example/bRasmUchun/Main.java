package org.example.bRasmUchun;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Reks");
        Animal duck = new Duck("Skurch");
        Animal cat = new Cat("Muiza");

        dog.sound();
        duck.sound();
        cat.sound();
    }
}
