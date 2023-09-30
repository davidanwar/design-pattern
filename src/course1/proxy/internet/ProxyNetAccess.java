package course1.proxy.internet;

public class ProxyNetAccess implements OfficeInternetAccess {

    private int employeeRank;
    private RealNetAccess realNetAccess;

    public ProxyNetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }

    @Override
    public void grantInternetAccess() {
        if (employeeRank >= 5) {
            realNetAccess = new RealNetAccess(employeeRank);
            realNetAccess.grantInternetAccess();
        } else {
            System.out.println("Internet Access Denied");
        }
    }
}
