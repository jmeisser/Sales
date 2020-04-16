import java.util.ArrayList;

public class TestEmployee extends Employee {
    public static void main(String args[]){
        Client bert = new Client(133, "Bert");
        Client morpheus = new Client(5813, "Morpheus");
        Client bob = new Client(319, "Bob");
        SalesManager Sam = new SalesManager("Sam",null,null,254);
        Sam.addClient(bob);
        Sam.addClient(bert);
        Sam.addClient(morpheus);
        System.out.println(Sam.getClients());
    }
}
