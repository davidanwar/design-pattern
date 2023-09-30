package course1.template;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillar();
        buildWall();
        buildWall();

        System.out.println("House is Built");
    }

    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    private void buildFoundation() {
        System.out.println("Building Foundation");
    }

    public abstract void buildPillar();
    public abstract void buildWall();
}
