package course1.bridge.vehicle;

public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
