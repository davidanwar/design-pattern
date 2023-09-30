package course1.template;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildPillar() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildWall() {
        System.out.println("Building Pillars with Wood Coating");
    }
}
