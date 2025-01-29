package com.example.lab4_tangry;

public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public void draw() {
        System.out.println("Drawing Shape");
    }
}


