
package webservices.Client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices.Client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateTRecordResponse_QNAME = new QName("http://webservices/", "createTRecordResponse");
    private final static QName _EditRecordResponse_QNAME = new QName("http://webservices/", "editRecordResponse");
    private final static QName _DisplayAllRecords_QNAME = new QName("http://webservices/", "displayAllRecords");
    private final static QName _DisplayAllRecordsResponse_QNAME = new QName("http://webservices/", "displayAllRecordsResponse");
    private final static QName _CreateSRecord_QNAME = new QName("http://webservices/", "createSRecord");
    private final static QName _EditRecord_QNAME = new QName("http://webservices/", "editRecord");
    private final static QName _GetRecordCountsResponse_QNAME = new QName("http://webservices/", "getRecordCountsResponse");
    private final static QName _CreateSRecordResponse_QNAME = new QName("http://webservices/", "createSRecordResponse");
    private final static QName _GetRecordCounts_QNAME = new QName("http://webservices/", "getRecordCounts");
    private final static QName _DisplayRecordResponse_QNAME = new QName("http://webservices/", "displayRecordResponse");
    private final static QName _TransferRecordResponse_QNAME = new QName("http://webservices/", "transferRecordResponse");
    private final static QName _CreateTRecord_QNAME = new QName("http://webservices/", "createTRecord");
    private final static QName _TransferRecord_QNAME = new QName("http://webservices/", "transferRecord");
    private final static QName _DisplayRecord_QNAME = new QName("http://webservices/", "displayRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices.Client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisplayRecord }
     * 
     */
    public DisplayRecord createDisplayRecord() {
        return new DisplayRecord();
    }

    /**
     * Create an instance of {@link TransferRecord }
     * 
     */
    public TransferRecord createTransferRecord() {
        return new TransferRecord();
    }

    /**
     * Create an instance of {@link CreateTRecord }
     * 
     */
    public CreateTRecord createCreateTRecord() {
        return new CreateTRecord();
    }

    /**
     * Create an instance of {@link TransferRecordResponse }
     * 
     */
    public TransferRecordResponse createTransferRecordResponse() {
        return new TransferRecordResponse();
    }

    /**
     * Create an instance of {@link DisplayRecordResponse }
     * 
     */
    public DisplayRecordResponse createDisplayRecordResponse() {
        return new DisplayRecordResponse();
    }

    /**
     * Create an instance of {@link CreateSRecordResponse }
     * 
     */
    public CreateSRecordResponse createCreateSRecordResponse() {
        return new CreateSRecordResponse();
    }

    /**
     * Create an instance of {@link GetRecordCounts }
     * 
     */
    public GetRecordCounts createGetRecordCounts() {
        return new GetRecordCounts();
    }

    /**
     * Create an instance of {@link EditRecord }
     * 
     */
    public EditRecord createEditRecord() {
        return new EditRecord();
    }

    /**
     * Create an instance of {@link GetRecordCountsResponse }
     * 
     */
    public GetRecordCountsResponse createGetRecordCountsResponse() {
        return new GetRecordCountsResponse();
    }

    /**
     * Create an instance of {@link CreateSRecord }
     * 
     */
    public CreateSRecord createCreateSRecord() {
        return new CreateSRecord();
    }

    /**
     * Create an instance of {@link DisplayAllRecordsResponse }
     * 
     */
    public DisplayAllRecordsResponse createDisplayAllRecordsResponse() {
        return new DisplayAllRecordsResponse();
    }

    /**
     * Create an instance of {@link DisplayAllRecords }
     * 
     */
    public DisplayAllRecords createDisplayAllRecords() {
        return new DisplayAllRecords();
    }

    /**
     * Create an instance of {@link EditRecordResponse }
     * 
     */
    public EditRecordResponse createEditRecordResponse() {
        return new EditRecordResponse();
    }

    /**
     * Create an instance of {@link CreateTRecordResponse }
     * 
     */
    public CreateTRecordResponse createCreateTRecordResponse() {
        return new CreateTRecordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "createTRecordResponse")
    public JAXBElement<CreateTRecordResponse> createCreateTRecordResponse(CreateTRecordResponse value) {
        return new JAXBElement<CreateTRecordResponse>(_CreateTRecordResponse_QNAME, CreateTRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "editRecordResponse")
    public JAXBElement<EditRecordResponse> createEditRecordResponse(EditRecordResponse value) {
        return new JAXBElement<EditRecordResponse>(_EditRecordResponse_QNAME, EditRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayAllRecords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "displayAllRecords")
    public JAXBElement<DisplayAllRecords> createDisplayAllRecords(DisplayAllRecords value) {
        return new JAXBElement<DisplayAllRecords>(_DisplayAllRecords_QNAME, DisplayAllRecords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayAllRecordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "displayAllRecordsResponse")
    public JAXBElement<DisplayAllRecordsResponse> createDisplayAllRecordsResponse(DisplayAllRecordsResponse value) {
        return new JAXBElement<DisplayAllRecordsResponse>(_DisplayAllRecordsResponse_QNAME, DisplayAllRecordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "createSRecord")
    public JAXBElement<CreateSRecord> createCreateSRecord(CreateSRecord value) {
        return new JAXBElement<CreateSRecord>(_CreateSRecord_QNAME, CreateSRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "editRecord")
    public JAXBElement<EditRecord> createEditRecord(EditRecord value) {
        return new JAXBElement<EditRecord>(_EditRecord_QNAME, EditRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordCountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getRecordCountsResponse")
    public JAXBElement<GetRecordCountsResponse> createGetRecordCountsResponse(GetRecordCountsResponse value) {
        return new JAXBElement<GetRecordCountsResponse>(_GetRecordCountsResponse_QNAME, GetRecordCountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "createSRecordResponse")
    public JAXBElement<CreateSRecordResponse> createCreateSRecordResponse(CreateSRecordResponse value) {
        return new JAXBElement<CreateSRecordResponse>(_CreateSRecordResponse_QNAME, CreateSRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordCounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getRecordCounts")
    public JAXBElement<GetRecordCounts> createGetRecordCounts(GetRecordCounts value) {
        return new JAXBElement<GetRecordCounts>(_GetRecordCounts_QNAME, GetRecordCounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "displayRecordResponse")
    public JAXBElement<DisplayRecordResponse> createDisplayRecordResponse(DisplayRecordResponse value) {
        return new JAXBElement<DisplayRecordResponse>(_DisplayRecordResponse_QNAME, DisplayRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "transferRecordResponse")
    public JAXBElement<TransferRecordResponse> createTransferRecordResponse(TransferRecordResponse value) {
        return new JAXBElement<TransferRecordResponse>(_TransferRecordResponse_QNAME, TransferRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "createTRecord")
    public JAXBElement<CreateTRecord> createCreateTRecord(CreateTRecord value) {
        return new JAXBElement<CreateTRecord>(_CreateTRecord_QNAME, CreateTRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "transferRecord")
    public JAXBElement<TransferRecord> createTransferRecord(TransferRecord value) {
        return new JAXBElement<TransferRecord>(_TransferRecord_QNAME, TransferRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "displayRecord")
    public JAXBElement<DisplayRecord> createDisplayRecord(DisplayRecord value) {
        return new JAXBElement<DisplayRecord>(_DisplayRecord_QNAME, DisplayRecord.class, null, value);
    }

}
