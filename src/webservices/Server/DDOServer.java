package webservices.Server;

import webservices.Client.DDOClassService;
import webservices.Client.LVLClassService;
import webservices.Client.WebInterface;
import webservices.Implementation.DDOClass;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class DDOServer {
    public static void main(String args[]) throws IOException {
        Endpoint endpoint = Endpoint.publish("http://localhost:8888/DDOClass", new DDOClass());
        if (endpoint.isPublished()) {
            System.out.println("Dollard-des-Ormeaux Server is successfully running");
        }
        DDOClassService ddoc = new DDOClassService();
        WebInterface ddo = ddoc.getDDOClassPort();
        ddo.createSRecord("Ashraf", "Amirali", "AI", "inactive", "12/09/2019", "DDO0000");
        ddo.createSRecord("Azim", "Surani", "React", "active", "01/12/2018", "DDO0000");
        ddo.createTRecord("Meet", "Patel", "1567 township", "514-587-8787", "Ruby", "DDO", "DDO0000");
        ddo.createTRecord("Akshita", "Patel", "1564 newstreet", "876-999-1926", "History", "DDO", "DDO0000");
    }
}

