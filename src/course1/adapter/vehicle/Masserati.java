package course1.adapter.vehicle;

public class Masserati extends Vehicle {


    public Masserati() {
        super("Masserati");
    }

    @Override
    int getSpeed() {
        return 200;
    }
}
