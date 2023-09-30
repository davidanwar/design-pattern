package course1.bridge.vehicle;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("Assembled");
    }
}
