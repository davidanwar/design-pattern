package course1.decorator.pizza;

public class Veggie extends Pizza {
    public Veggie() {
        super("Veggie");
    }

    @Override
    public int getCost() {
        return 10;
    }
}
