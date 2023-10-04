package course2.command.gameboy;

public class KirbyCharacterReceiver {

    private String name;

    public void moveUp() {
        System.out.println(getName() + " Jumping Up!");
    }

    public void moveDown() {
        System.out.println(getName() + " Moving Down!");
    }

    public void moveRight() {
        System.out.println(getName() + " Moving Right!");
    }

    public void moveLeft() {
        System.out.println(getName() + " Moving Left!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
