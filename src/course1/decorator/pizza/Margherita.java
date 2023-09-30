package course1.decorator.pizza;

public class Margherita extends Pizza {


    public Margherita() {
        super("Margherita");
    }

    @Override
    public int getCost() {
        return 20;
    }
}
