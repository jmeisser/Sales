import java.util.Comparator;

public class Client implements Comparable<Client>{
    int clientID;
    String clientName;
    private Employee sales;

    public Client (int aClientID, String aClientName){
        this.clientID = aClientID;
        this.clientName = aClientName;
    }

    public void setSales(Employee newSales){
        this.sales = newSales;
    }
    @Override
    public int compareTo(Client aClient){
        return this.clientID-aClient.clientID;
    }

    protected int getClientID() {
        return clientID;
    }

    protected void setClientID(int clientID) {
        this.clientID = clientID;
    }

    protected String getClientName() {
        return clientName;
    }

    protected void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double totalSales(){
        return 0;
    }
}
