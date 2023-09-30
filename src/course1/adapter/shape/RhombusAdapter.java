package course1.adapter.shape;

public class RhombusAdapter extends Rhombus implements Shape {
    public RhombusAdapter(double a, double b) {
        super(a, b);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus can't be resized");
    }

    @Override
    public String description() {
        return "Rhombus Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
