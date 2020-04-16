public class Client{
    private int clientID;
    private String clientName;
    private double sales;
    private Employee emp;


    public Client (int aClientID, String aClientName, Employee emp){
        this.clientID = aClientID;
        this.clientName = aClientName;
        this.emp=emp;
    }

//    @Override
//    public int compareTo(Client clientCmp) {
//        int cmpClientID=((Client)clientCmp).getClientID();
//        /* For Ascending order*/
//        return this.clientID-cmpClientID;
//    }

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

//    public void setSales(Employee newSales){
//        if(sales != newSales){
//            Employee old = sales;
//            sales = newSales;
//            if(newSales != null){
//                newSales.addClient(this);
//            }
//        }
//    }
    public double totalSales(){
        return 0.0;
    }
}
