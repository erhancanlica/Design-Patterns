package structural.patterns.bridge;

public class BridgeService {

    public static void main(String[] args) {
        Shape redCircle = new Circle(50, 50, 3, new RedCircle());
        Shape blueCircle = new Circle(25, 25, 4, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
    }
}
