package course2.decorator.icecream;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new BasicIceCream();
        System.out.println("Basic Ice Cream Cost $" + iceCream.cost());

        // Adding Vanilla in Order
        iceCream = new VanillaIceCream(iceCream);
        System.out.println("Adding Vanilla Cost Is: " + iceCream.cost());
        iceCream = new ChocolateIceCream(iceCream);
        System.out.println("Adding Chocolate Cost Is: " + iceCream.cost());
    }
}
