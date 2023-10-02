package course2.decorator.icecream;

public class ChocolateIceCream extends IceCreamDecorator{
    public ChocolateIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        System.out.println("Adding Chocolate Ice Cream!");
        return 1.0 + iceCream.cost();
    }
}
