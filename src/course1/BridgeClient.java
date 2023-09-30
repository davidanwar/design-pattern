package course1;

import course1.bridge.shape.Circle;
import course1.bridge.shape.RedColor;
import course1.bridge.shape.Shape;
import course1.bridge.vehicle.Assemble;
import course1.bridge.vehicle.Car;
import course1.bridge.vehicle.Produce;
import course1.bridge.vehicle.Vehicle;

public class BridgeClient {
    public static void main(String[] args) {
        Shape shape = new Circle(new RedColor());
        shape.applyColorToShape();

        Vehicle vehicle = new Car(new Assemble(), new Produce());
        vehicle.manufacture();
    }
}
