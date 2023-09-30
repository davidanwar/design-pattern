package course1.adapter.shape;

public class GeometricShapeAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeAdapter(GeometricShape adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized now");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle Object";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus Object";
        } else {
            return "Unknown Object";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
