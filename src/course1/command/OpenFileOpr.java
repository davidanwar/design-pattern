package course1.command;

public class OpenFileOpr implements TextFileOperation {

    private TextFile textFile;
    @Override
    public String execute() {
        return textFile.save();
    }
}
