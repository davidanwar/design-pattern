package course1;

import course1.template.HouseTemplate;
import course1.template.WoodenHouse;

public class TemplateClient {
    public static void main(String[] args) {
        HouseTemplate woodHouse = new WoodenHouse();
        woodHouse.buildHouse();
    }
}
