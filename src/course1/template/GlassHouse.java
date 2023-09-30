package course1.template;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildPillar() {
        System.out.println("Building Pillars with Glass");
    }

    @Override
    public void buildWall() {
        System.out.println("Building Glass Wall");
    }
}
