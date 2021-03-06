import java.util.ArrayList;
import java.util.Set;

public class SalesManager extends Employee{
    String employeeName;
    ArrayList<Employee> employees = new ArrayList<Employee>();
    SalesManager manager;
    long salesID;

    public SalesManager(String aEmployeeName, SalesManager aManager, long aSalesID){
        super();
        this.employeeName = aEmployeeName;
        this.employees = new ArrayList<Employee>();
        this.manager = aManager;
        this.salesID = aSalesID;
    }

    protected String getEmployeeName() {
        return employeeName;
    }

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
//    public ArrayList<String> getEmployeeNames() {
//        ArrayList<String> employeeNames = new ArrayList<String>();
//        for(Employee aEmployee : this.employees){
//            employeeNames.add(aEmployee.);
//        }
//        return employeeNames;
//    }
    protected ArrayList<Employee> getEmployees() {
        return employees;
    }

    protected void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
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
