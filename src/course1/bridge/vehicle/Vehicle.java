package course1.bridge.vehicle;

public abstract class Vehicle {

    Workshop assembleWorkshop;
    Workshop produceWorkshop;

    public Vehicle(Workshop assembleWorkshop, Workshop produceWorkshop) {
        this.assembleWorkshop = assembleWorkshop;
        this.produceWorkshop = produceWorkshop;
    }

    public abstract void manufacture();
}
