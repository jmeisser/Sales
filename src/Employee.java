import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public abstract class Employee {
    private ArrayList<Client> clients;
    public Employee(){
        clients = new ArrayList<Client>();
    }


    public boolean addClient(Client aClient){
        clients.add(aClient);
        sort(clients);
        aClient.setSales(this);
        return true;
    }
    public ArrayList<Client> getClients(){
        return clients;
    }

    private ArrayList<Client> sort(ArrayList<Client> clients) {
        Client firstClient = null;
        int minID = 100000;
        ArrayList<Client> sortedClients = new ArrayList<Client>();
        for(Client aClient : clients) {
                if(aClient.getClientID() < minID) {
                    minID = aClient.getClientID();
                    firstClient = aClient;
                }
            sortedClients.add(firstClient);
        }
        return sortedClients;
    }
}

}
