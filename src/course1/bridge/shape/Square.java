package course1.bridge.shape;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColorToShape() {
        System.out.println("Square filled with color");
        color.applyColor();
    }
}
