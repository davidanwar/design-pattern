package course1.facede;

public class NonVegResto implements Hotel {
    @Override
    public Menus getMenus() {
        NonVegMenu nonVegFood = new NonVegMenu();
        return nonVegFood;
    }
}
