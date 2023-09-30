package course1.proxy.internet;

public class RealNetAccess implements OfficeInternetAccess {

    private int employeeRank;

    public RealNetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access Granted! Employee Rank : " + employeeRank);
    }
}
