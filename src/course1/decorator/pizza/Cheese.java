package course1.decorator.pizza;

public class Cheese extends ToppingDecorator {

    Pizza pizza;
    public Cheese(String description, Pizza pizza) {
        super("Cheese Topping");
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 5 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheese Toppings";
    }
}
