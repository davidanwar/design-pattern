package course2.decorator.icecream;

public class BasicIceCream extends IceCream {

    public BasicIceCream() {
        System.out.println("Creating a Basic Ice Cream");
    }
    @Override
    public double cost() {
        return 0.5;
    }
}
