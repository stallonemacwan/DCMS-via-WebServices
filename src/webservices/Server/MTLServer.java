package webservices.Server;

import webservices.Client.LVLClassService;
import webservices.Client.MTLClassService;
import webservices.Client.WebInterface;
import webservices.Implementation.MTLClass;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class MTLServer {
    public static void main(String args[]) throws IOException {
        Endpoint endpoint = Endpoint.publish("http://localhost:8887/MTLClass", new MTLClass());
        if (endpoint.isPublished()) {
            System.out.println("Montreal Server is successfully running");
        }MTLClassService mtlc = new MTLClassService();
        WebInterface mtl = mtlc.getMTLClassPort();
        mtl.createSRecord("Jay", "Patel", "English", "active", "12/09/2020", "MTL0000");
        mtl.createSRecord("Stallone", "Mecwan", "Math", "inactive", "01/12/2000", "MTL0000");
        mtl.createTRecord("Harsh", "Agrawal", "1234 avenue" , "234-587-1126", "Geography", "MTL", "MTL0000");
        mtl.createTRecord("Pavit", "Singh", "1564 palm street" , "234-587-1926", "Mythology", "MTL", "MTL0000");
    }
}
