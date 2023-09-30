package course1.adapter.vehicle;

public class MasseratiAdapter extends VehicleAdapter {
    public MasseratiAdapter() {
        super("Masserati");
    }

    @Override
    public int speedKMH() {
        return (int) (200 * 1.6);
    }
}
