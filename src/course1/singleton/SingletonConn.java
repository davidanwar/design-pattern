package course1.singleton;

public class SingletonConn {
    private SingletonConn() {
    }

    private static SingletonConn onlyInstance;

    public static SingletonConn getOnlyInstance() {
        if (onlyInstance == null) {
            onlyInstance = new SingletonConn();
        }
        return onlyInstance;
    }

    public void getProcess() {
        System.out.println("Process in course1.singleton");
    }
}
