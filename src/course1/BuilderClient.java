package course1;

import course1.builder.Hamburger;

public class BuilderClient {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger();
        hamburger.createSandwich();
    }
}
