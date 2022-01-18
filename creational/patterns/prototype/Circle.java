package creational.patterns.prototype;

public class Circle extends Shape {

    private int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.radius = circle.radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Circle)) return false;
        Circle circle = (Circle) object2;
        return circle.radius == radius;
    }
}
