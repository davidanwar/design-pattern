package course1.facede;

public class BothResto implements Hotel {
    @Override
    public Menus getMenus() {
        BothVegNon bothVegNon = new BothVegNon();
        return bothVegNon;
    }
}
