package course1.adapter.vehicle;

public abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract int getSpeed();

    @Override
    public String toString() {
        return brand + " : " + getSpeed() + " MPH";
    }
}
