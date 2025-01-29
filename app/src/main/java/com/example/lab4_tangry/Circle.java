package com.example.lab4_tangry;
// Finished Circle Class
public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // For a circle, the perimeter is its circumference.
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        // Custom draw logic for a circle
        System.out.println("Drawing Circle at (" + x + ", " + y + ") "
                + "with radius " + radius
                + ", area: " + getArea()
                + ", perimeter: " + getPerimeter());
    }

    // --- Getters and Setters ---
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
