package course1.facede;

public class VegResto implements Hotel {
    @Override
    public Menus getMenus() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
