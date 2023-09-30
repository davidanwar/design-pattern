package course1.facede;

public class HotelKeeper {

    public VegMenu getVegManu() {
        VegResto vegResto = new VegResto();
        VegMenu vegMenu = (VegMenu) vegResto.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu() {
        NonVegResto nonVegResto = new NonVegResto();
        NonVegMenu nonVegMenu = (NonVegMenu) nonVegResto.getMenus();
        return nonVegMenu;
    }

    public BothVegNon getVegNon() {
        BothResto bothResto = new BothResto();
        BothVegNon bothVegNon = (BothVegNon) bothResto.getMenus();
        return bothVegNon;
    }
}
