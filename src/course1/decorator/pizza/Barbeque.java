package course1.decorator.pizza;

public class Barbeque extends ToppingDecorator {

    Pizza pizza;
    public Barbeque(String description, Pizza pizza) {
        super(description);
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 10 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Barbeque Topping";
    }
}
