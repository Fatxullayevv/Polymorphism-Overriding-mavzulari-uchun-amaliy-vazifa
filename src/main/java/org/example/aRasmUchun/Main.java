package org.example.aRasmUchun;


public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimetr());

        Trapezium trapezium = new Trapezium(3, 4, 5);
        System.out.println("Trapezium Area: " + trapezium.area());
        System.out.println("Trapezium Perimeter: " + trapezium.perimetr());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimetr());
    }
}