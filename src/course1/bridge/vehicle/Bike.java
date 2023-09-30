package course1.bridge.vehicle;

public class Bike extends Vehicle {
    public Bike(Workshop assembleWorkshop, Workshop produceWorkshop) {
        super(assembleWorkshop, produceWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike");
        assembleWorkshop.work();
        produceWorkshop.work();
    }
}
