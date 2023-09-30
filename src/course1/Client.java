package course1;

import course1.adapter.shape.*;

public class Client {
    public static void main(String[] args) {

//        Shape shape = new Circle();
//        shape.draw();
//
//        GeometricShape geometricShape = new Rhombus(2, 3);
//        geometricShape.drawShape();

        // 1st Approach
        Shape shape1 = new GeometricShapeAdapter(new Triangle(1, 2, 3));
        shape1.draw();

        // 2st Approach
        Shape shape2 = new RhombusAdapter(2,3);
        shape2.draw();
    }
}
