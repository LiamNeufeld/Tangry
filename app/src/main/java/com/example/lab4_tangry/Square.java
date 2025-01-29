package com.example.lab4_tangry;

public class Square extends Shape {

    int length = 0;

    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }
}
