package course1;

import course1.command.TextFile;
import course1.command.TextFileInvoker;

public class CommandClient {
    public static void main(String[] args) {
        TextFileInvoker textFileInvoker = new TextFileInvoker();
        TextFile textFile = new TextFile("file.txt");
    }
}
