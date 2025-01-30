package com.example.lab4_tangry;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color = "yellowish";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void draw() {
        System.out.println("Drawing Shape");
    }
}


