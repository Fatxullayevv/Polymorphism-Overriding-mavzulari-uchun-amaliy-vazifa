package org.example.aRasmUchun;

public class Rectangle extends GeometricFigure {

    public double sideA;
    public double sideB;

    public Rectangle(){}

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public double perimetr() {
        return 2 * (sideA + sideB);
    }
}
