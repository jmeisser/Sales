import java.util.*;
public class Main {

    public static void main(String args[]){
        ArrayList<Client> clientList = new ArrayList<Client>();
        clientList.add(new Client(324,"Adam",00216330));
        clientList.add(new Client(908,"Eve",94565792));
        clientList.add(new Client(106,"Sam",530349716));
        clientList.add(new Client(806,"Dan",650355094));

       ArrayList sorted=Employee.getClients(clientList);
        System.out.println(sorted);
//        for(Client str: arraylist){
//            System.out.println(str);
//        }
    }
}