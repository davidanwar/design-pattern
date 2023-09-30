package course1;

import course1.decorator.car.BasicCar;
import course1.decorator.car.Car;
import course1.decorator.car.SportCar;
import course1.decorator.pizza.Barbeque;
import course1.decorator.pizza.Cheese;
import course1.decorator.pizza.Margherita;
import course1.decorator.pizza.Pizza;

public class DecoratorClient {
    public static void main(String[] args) {
        Pizza margherita = new Margherita();
        System.out.println(margherita.getDescription() + " Cost " + margherita.getCost());
        margherita = new Cheese(margherita.getDescription(), margherita);
        System.out.println(margherita.getDescription() + " Cost " + margherita.getCost());
        margherita = new Barbeque(margherita.getDescription(), margherita);
        System.out.println(margherita.getDescription() + " Cost " + margherita.getCost());
        margherita = new Margherita();
        System.out.println(margherita.getDescription() + " Cost " + margherita.getCost());


        Car basicCar = new BasicCar();
        basicCar.assemble();
        Car sportCart = new SportCar(basicCar);
        sportCart.assemble();
    }
}
