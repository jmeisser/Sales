public class Client{
    int clientID;
    String clientName;
    private Employee sales;
    public void setSales(Employee newSales){
        if(sales != newSales){
            Employee old = sales;
            sales = newSales;
            if(newSales != null){
                newSales.addClient(this);
            }
        }
    }

    public Client (int aClientID, String aClientName){
        this.clientID = aClientID;
        this.clientName = aClientName;
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
