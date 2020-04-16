import java.util.*;

public abstract class Employee {
    private ArrayList<Client> clients = new ArrayList<Client>();


//    public Employee(){
//        clients = new ArrayList<Client>();
//    }


    public boolean addClient(Client aClient){
        clients.add(aClient);
        sortClient(clients);
        return false;
    }
    public static ArrayList<Client> getClients(ArrayList<Client> clients){
        return clients;
    }

    private ArrayList<Client> sortClient(ArrayList<Client> clients) {
        ArrayList<Client> clientsToBeSorted = new ArrayList<Client>();
        Collections.sort(clientsToBeSorted, new CustomComparator());
    }

    public class CustomComparator implements Comparator<Client> {
        @Override
        public int compare(Client client1, Client client2) {
            return client1.getClientID().compareTo(client2.getClientID());
        }
    }


}

