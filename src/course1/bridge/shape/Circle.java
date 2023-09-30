package course1.bridge.shape;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColorToShape() {
        System.out.println("Circle filled with color");
        color.applyColor();
    }
}
