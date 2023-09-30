package course1.bridge.shape;

public abstract class Shape {

    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColorToShape();
}
