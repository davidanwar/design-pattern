package course2.decorator.icecream;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice Cream!");
        return 1.5 + iceCream.cost();
    }
}
