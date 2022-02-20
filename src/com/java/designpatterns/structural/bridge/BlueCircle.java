package com.java.designpatterns.structural.bridge;

public class BlueCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
