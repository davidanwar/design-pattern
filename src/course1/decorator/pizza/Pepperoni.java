package course1.decorator.pizza;

public class Pepperoni extends Pizza {

    public Pepperoni() {
        super("Pepperoni");
    }

    @Override
    public int getCost() {
        return 30;
    }
}
