import java.util.*;

public abstract class Employee {
    private ArrayList<Client> clients;

    public Employee() {
        clients = new ArrayList<Client>();
    }


    public boolean addClient(Client aClient) {
        this.clients.add(aClient);
//        System.out.println("after this.clients.add");
//        System.out.println(this.clients);
        Collections.sort(this.clients);
//        System.out.println("afte collections.sort");
//        System.out.println(this.clients);
        aClient.setSales(this);
        return true;
    }

    public ArrayList<Client> getClients() {
        return this.clients;
    }
    public ArrayList<String> getClientInfo() {
        ArrayList<String> clientNames = new ArrayList<String>();
        for(Client aClient : this.clients){
            clientNames.add(aClient.clientName + " " + aClient.clientID);
        }
        return clientNames;
    }
}
