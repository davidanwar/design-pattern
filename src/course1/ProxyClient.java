package course1;

import course1.proxy.Image;
import course1.proxy.RealImage;
import course1.proxy.internet.OfficeInternetAccess;
import course1.proxy.internet.ProxyNetAccess;

public class ProxyClient {

    public static void main(String[] args) {
        Image image = new RealImage("baby.png");
        image.display();
        image.display();
        image.display();

        // Internet Access with Proxy
        OfficeInternetAccess access = new ProxyNetAccess(4);
        access.grantInternetAccess();
    }
}
