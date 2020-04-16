import java.util.ArrayList;
import java.util.Set;

public class SalesManager extends Employee{
    protected String employeeName;
    protected ArrayList<Employee> emp;
    protected SalesManager manager;
    protected long salesID;

    public SalesManager(Set theseClients, String aEmployeeName, ArrayList<Employee>emp, SalesManager aManager, long aSalesID){
//        super();
        this.employeeName = aEmployeeName;
        this.emp=emp;
        this.manager = aManager;
        this.salesID = aSalesID;
    }

    protected String getEmployeeName() {
        return employeeName;
    }

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    protected ArrayList<Employee> getEmployees() {
        return emp;
    }

    protected void setEmployees(ArrayList<Employee>emp) {
        this.emp = emp;
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

    protected SalesManager getManager() {
        return manager;
    }

    protected double bonus(){
        return 10000*this.getClients().size();
    }
}
