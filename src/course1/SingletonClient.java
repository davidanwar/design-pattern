package course1;

import course1.singleton.SingletonConn;

public class SingletonClient {
    public static void main(String[] args) {
        SingletonConn singletonConn1 = SingletonConn.getOnlyInstance();
        System.out.println(singletonConn1.toString());
        SingletonConn singletonConn2 = SingletonConn.getOnlyInstance();
        System.out.println(singletonConn2.toString());
    }
}
