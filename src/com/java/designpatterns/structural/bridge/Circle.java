package com.java.designpatterns.structural.bridge;

public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    protected Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
