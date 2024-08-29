package org.example.aRasmUchun;

public class Triangle extends GeometricFigure {

    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(){}

    public Triangle(double sideA,double sideB, double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimetr() {
        return sideA + sideB + sideC;
    }
}