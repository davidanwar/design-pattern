package course1.builder;

public abstract class SandwichBuilder {

    Sandwich sandwich;
    public void createSandwich() {
        sandwich = new Sandwich();
        buildMeat();
        buildSauce();
        buildDelivery();
        System.out.println("Sandwich Created " + sandwich.getSauce() + " + " + sandwich.getMeat() + " + " + sandwich.getDelivery());
    }

    public abstract void buildMeat();
    public abstract void buildSauce();
    public abstract void buildDelivery();
}
