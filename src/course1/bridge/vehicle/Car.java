package course1.bridge.vehicle;

public class Car extends Vehicle {
    public Car(Workshop assembleWorkshop, Workshop produceWorkshop) {
        super(assembleWorkshop, produceWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println("Car ");
        assembleWorkshop.work();
        produceWorkshop.work();
    }
}
