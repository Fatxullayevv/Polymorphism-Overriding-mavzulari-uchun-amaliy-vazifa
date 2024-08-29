package org.example.aRasmUchun;

public class Trapezium  extends GeometricFigure {

    public double sideA;
    public double sideB;
    public double high;

    public Trapezium(){}

    public Trapezium(double sideA, double sideB ,double high){
        this.sideA=sideA;
        this.sideB=sideB;
        this.high=high;
    }

    @Override
    public double area() {
        return ((sideA + sideB) / 2) * high;
    }

    @Override
    public double perimetr() {
        return sideA + sideB + 2 * high;
    }
}
