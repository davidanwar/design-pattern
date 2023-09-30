package course1.command;

public class TextFile {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public String open() {
        return "Open File " + fileName;
    }

    public String save() {
        return "Save File " + fileName;
    }
}
