package course1.adapter.vehicle;

public class Buggati extends Vehicle {
    public Buggati() {
        super("Buggati");
    }

    @Override
    int getSpeed() {
        return 240;
    }
}
