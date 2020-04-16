import java.util.ArrayList;
import java.util.Set;

public class SalesAssociate extends Employee {
    String employeeName;
    SalesManager manager;
    long salesID;

    public SalesAssociate(String aEmployeeName, SalesManager aManager, long aSalesID){
        super();
        this.employeeName = aEmployeeName;
        this.manager = aManager;
        this.salesID = aSalesID;
    }

    protected String getEmployeeName() {
        return employeeName;
    }

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    protected SalesManager getManager() {
        return manager;
    }

    protected void setManager(SalesManager manager) {
        this.manager = manager;
    }

    protected long getSalesID() {
        return salesID;
    }

    protected void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    public double bonus(){
        return 10000*this.getClients().size();
    }
}
