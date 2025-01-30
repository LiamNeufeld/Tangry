package com.example.lab4_tangry;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Ellipse extends Shape {
    private float x;
    private float y;
    private float radiusX;
    private float radiusY;
    private Paint paint;

    public Ellipse(float x, float y, float radiusX, float radiusY, Paint paint) {
        this.x = x;
        this.y = y;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.paint = paint;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawOval(x - radiusX, y - radiusY, x + radiusX, y + radiusY, paint);
    }

    @Override
    public double getArea() {
        return Math.PI * radiusX * radiusY;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((radiusX * radiusX + radiusY * radiusY) / 2.0);
    }

    @Override
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    @Override
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadiusX() {
        return radiusX;
    }

    public void setRadiusX(float radiusX) {
        this.radiusX = radiusX;
    }

    public float getRadiusY() {
        return radiusY;
    }

    public void setRadiusY(float radiusY) {
        this.radiusY = radiusY;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }
}