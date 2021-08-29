package webservices.Server;

import webservices.Client.DDOClassService;
import webservices.Client.LVLClassService;
import webservices.Client.WebInterface;
import webservices.Implementation.LVLClass;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class LVLServer {
    public static void main(String args[]) throws IOException {
        Endpoint endpoint = Endpoint.publish("http://localhost:8889/LVLClass", new LVLClass());
        if (endpoint.isPublished()) {
            System.out.println("Laval Server is successfully running");
        }LVLClassService lvlc = new LVLClassService();
        WebInterface lvl = lvlc.getLVLClassPort();
        lvl.createSRecord("Shubham", "Patel", "French", "active", "12/09/2021", "LVL0000");
        lvl.createSRecord("Vandit", "Thakkar", "Spanish", "inactive", "01/12/2020", "LVL0000");
        lvl.createTRecord("Bhoomi", "Shah", "1567 township" , "514-587-1126", "Java", "LVL", "LVL0000");
        lvl.createTRecord("Nilesh", "Agrawal", "1564 newstreet" , "234-999-1926", "Python", "LVL", "LVL0000");
    }
}
