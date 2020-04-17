import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        SalesManager mngSam = new SalesManager("Sam",null,3);
        SalesManager mngCharlie = new SalesManager("Charlie", null, 4);
        SalesAssociate asscSven = new SalesAssociate ("Sven", mngCharlie, 7);
        SalesAssociate asscAlex = new SalesAssociate ("Alex", mngSam, 20);
        ArrayList<Employee> samEmployees = new ArrayList<Employee>();
        ArrayList<Employee> charlieEmployees = new ArrayList<Employee>();
        samEmployees.add(asscAlex);
        charlieEmployees.add(asscSven);
        Client cltJo = new Client (32,"Jo");
        Client cltRiley = new Client (473,"Riley");
        Client cltPeyton = new Client (555,"Peyton");
        Client cltAvery = new Client (654,"Avery");
        Client cltTaylor = new Client (840,"Taylor");
        Client cltRemi = new Client (912,"Remi");
        mngSam.addClient(cltJo);
        mngSam.addClient(cltRiley);
        mngCharlie.addClient(cltAvery);
        asscSven.addClient(cltPeyton);
        asscAlex.addClient(cltTaylor);
        asscAlex.addClient(cltRemi);
        mngCharlie.setEmployees(charlieEmployees);
        mngSam.setEmployees(samEmployees);

        System.out.println("Sales Manager: " + mngSam.employeeName + " Employees: " + mngSam.employees + " Clients: " + mngSam.getClientInfo());
        System.out.println("Sales Manager: " + mngCharlie.employeeName + " Employees: " + mngCharlie.employees + " Clients: " + mngCharlie.getClientInfo());
        System.out.println("Sales Associate: " + asscSven.employeeName + " Sales Manager: " + asscSven.manager.employeeName + " Clients: " + asscSven.getClientInfo());
        System.out.println("Sales Associate: " + asscAlex.employeeName + " Sales Manager: " + asscAlex.manager.employeeName + " Clients: " + asscAlex.getClientInfo());
    }
}