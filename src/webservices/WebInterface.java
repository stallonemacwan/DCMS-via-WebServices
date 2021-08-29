package webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebInterface {
    @WebMethod
    public String createTRecord(String firstName, String lastName, String address, String phone, String specialization, String location, String manID) ;
    @WebMethod
    public String createSRecord(String firstName, String lastName, String courseRegistered, String status, String statusDate, String manID) ;
    @WebMethod
    public String getRecordCounts(String manID);
    @WebMethod
    public String editRecord(String recID, String fieldName, String newValue, String manID) ;
    @WebMethod
    public String displayAllRecords(String manID) ;
    @WebMethod
    public String displayRecord(String recID, String manID);
    @WebMethod
    public String transferRecord (String recID, String toServer, String manID);

}
