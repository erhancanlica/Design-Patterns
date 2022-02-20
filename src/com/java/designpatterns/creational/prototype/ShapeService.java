package com.java.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShapeService {

    private static final Logger logger = Logger.getLogger(ShapeService.class.getName());

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        List<Shape> shapeCopyList = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(5);
        circle.setY(10);
        circle.setRadius(8);
        circle.setColor("blue");
        shapeList.add(circle);

        Circle cloneCircle = (Circle) circle.clone();
        shapeList.add(cloneCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(20);
        rectangle.setColor("purple");
        shapeList.add(rectangle);

        cloneAndCompare(shapeList, shapeCopyList);


    }

    private static void cloneAndCompare(List<Shape> shapeList, List<Shape> shapeCopyList) {

        for (Shape shape: shapeList) {
            shapeCopyList.add(shape.clone());
        }

        for (int i = 0; i < shapeList.size() ; i++) {
            if(shapeList.get(i) != shapeCopyList.get(i)) {
                logger.log(Level.INFO, "Shapes are different object");

                if (shapeList.get(i).equals(shapeCopyList.get(i))) {
                    logger.log(Level.INFO,"They are identical");
                } else {
                    logger.log(Level.INFO,"They are not identical");
                }
            } else {
                logger.log(Level.INFO,"Shape objects are the same");
            }
        }
    }
}

