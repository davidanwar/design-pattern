package course2.decorator.icecream;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice Cream!");
        return 1.0 + iceCream.cost();
    }
}
