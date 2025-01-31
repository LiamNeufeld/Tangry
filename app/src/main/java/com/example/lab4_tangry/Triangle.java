package com.example.lab4_tangry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private int x0, y0, x1, y1, x2, y2; // vertices
    public Triangle(int x0, int y0, int x1, int y1, int x2, int y2) {
        super(x0, y0);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public double getArea(){
        // https://en.wikipedia.org/wiki/Triangle#:~:text=Given%20affine%20coordinates,%5B47%5D
        return (double)(x0*y1 - x1*y0 + x1*y2 - x2*y1 + x2*y0 - x0*y2)/2;
    }

    @Override
    public double getPerimeter() {
        double sum = 0.0;
        sum += sqrt(pow(this.x1 - this.x0, 2) + pow(this.y1 - this.y0, 2));
        sum += sqrt(pow(this.x2 - this.x1, 2) + pow(this.y2 - this.y1, 2));
        sum += sqrt(pow(this.x2 - this.x0, 2) + pow(this.y2 - this.y0, 2));
        return sum;
    }
}
