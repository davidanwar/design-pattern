package course2.command.gameboy;

public class MarioUpCommand implements Command {

    MarioCharacterReceiver marioCharacterReceiver;

    public MarioUpCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveUp();
    }
}
