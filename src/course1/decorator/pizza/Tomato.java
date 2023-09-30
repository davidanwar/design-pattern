package course1.decorator.pizza;

public class Tomato extends ToppingDecorator {

    Pizza pizza;
    public Tomato(String description, Pizza pizza) {
        super(description);
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 5 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Tomato Topping";
    }
}
