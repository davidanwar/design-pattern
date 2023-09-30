package course1.command;

public class SaveFileOpr implements TextFileOperation {

    private TextFile textFile;
    @Override
    public String execute() {
        return textFile.open();
    }
}
