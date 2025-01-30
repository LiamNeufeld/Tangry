package com.example.lab4_tangry;

public class Rhombus extends Shape{

    private int diagonal1, diagonal2, side;

    public Rhombus(int x, int y) {
        super(x, y);
    }


    @Override
    public double getArea() {
        return diagonal1 * diagonal2 / 2.0;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }
}
