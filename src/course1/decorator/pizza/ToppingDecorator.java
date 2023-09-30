package course1.decorator.pizza;

public abstract class ToppingDecorator extends Pizza {
    public ToppingDecorator(String description) {
        super(description);
    }

    public abstract String getDescription();
}
