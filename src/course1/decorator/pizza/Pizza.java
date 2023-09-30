package course1.decorator.pizza;

public abstract class Pizza {

    private String description = "Basic Pizza";

    public Pizza(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public abstract int getCost();
}
