
package uk.co.noetic.kaba;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.noetic.kaba package. 
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

    private final static QName _Action_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "Action");
    private final static QName _MainRoomNo_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "MainRoomNo");
    private final static QName _GuestName_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "GuestName");
    private final static QName _MessageID_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "MessageID");
    private final static QName _To_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "To");
    private final static QName _AuthHeader_QNAME = new QName("http://tempuri.org", "AuthHeader");
    private final static QName _ReplyTo_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing/role/anonymous", "ReplyTo");
    private final static QName _Timestamp_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Timestamp");
    private final static QName _UsernameToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "UsernameToken");
    private final static QName _From_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "From");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.noetic.kaba
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDeviceSecKeysRightsResponse }
     * 
     */
    public GetDeviceSecKeysRightsResponse createGetDeviceSecKeysRightsResponse() {
        return new GetDeviceSecKeysRightsResponse();
    }

    /**
     * Create an instance of {@link CreateNewBookingResponse }
     * 
     */
    public CreateNewBookingResponse createCreateNewBookingResponse() {
        return new CreateNewBookingResponse();
    }

    /**
     * Create an instance of {@link ExtendCheckOutResponse }
     * 
     */
    public ExtendCheckOutResponse createExtendCheckOutResponse() {
        return new ExtendCheckOutResponse();
    }

    /**
     * Create an instance of {@link MakeUnassignedBookingResponse }
     * 
     */
    public MakeUnassignedBookingResponse createMakeUnassignedBookingResponse() {
        return new MakeUnassignedBookingResponse();
    }

    /**
     * Create an instance of {@link CancelGuestsMobileAccessToRoomResponse }
     * 
     */
    public CancelGuestsMobileAccessToRoomResponse createCancelGuestsMobileAccessToRoomResponse() {
        return new CancelGuestsMobileAccessToRoomResponse();
    }

    /**
     * Create an instance of {@link PublishResponseComplexTypesResponse }
     * 
     */
    public PublishResponseComplexTypesResponse createPublishResponseComplexTypesResponse() {
        return new PublishResponseComplexTypesResponse();
    }

    /**
     * Create an instance of {@link DenyAccessToGuestResponse }
     * 
     */
    public DenyAccessToGuestResponse createDenyAccessToGuestResponse() {
        return new DenyAccessToGuestResponse();
    }

    /**
     * Create an instance of {@link ChangeKeyAccessResponse }
     * 
     */
    public ChangeKeyAccessResponse createChangeKeyAccessResponse() {
        return new ChangeKeyAccessResponse();
    }

    /**
     * Create an instance of {@link CheckOutGuestResponse }
     * 
     */
    public CheckOutGuestResponse createCheckOutGuestResponse() {
        return new CheckOutGuestResponse();
    }

    /**
     * Create an instance of {@link AddGuestAccessResponse }
     * 
     */
    public AddGuestAccessResponse createAddGuestAccessResponse() {
        return new AddGuestAccessResponse();
    }

    /**
     * Create an instance of {@link MakeDuplicateKeyResponse }
     * 
     */
    public MakeDuplicateKeyResponse createMakeDuplicateKeyResponse() {
        return new MakeDuplicateKeyResponse();
    }

    /**
     * Create an instance of {@link ChangeGuestAccessResponse }
     * 
     */
    public ChangeGuestAccessResponse createChangeGuestAccessResponse() {
        return new ChangeGuestAccessResponse();
    }

    /**
     * Create an instance of {@link ReEstablishAccessToGuestResponse }
     * 
     */
    public ReEstablishAccessToGuestResponse createReEstablishAccessToGuestResponse() {
        return new ReEstablishAccessToGuestResponse();
    }

    /**
     * Create an instance of {@link AddSharedGuestResponse }
     * 
     */
    public AddSharedGuestResponse createAddSharedGuestResponse() {
        return new AddSharedGuestResponse();
    }

    /**
     * Create an instance of {@link PublishFaultListResponse }
     * 
     */
    public PublishFaultListResponse createPublishFaultListResponse() {
        return new PublishFaultListResponse();
    }

    /**
     * Create an instance of {@link UpdateKeyTransactionStatusResponse }
     * 
     */
    public UpdateKeyTransactionStatusResponse createUpdateKeyTransactionStatusResponse() {
        return new UpdateKeyTransactionStatusResponse();
    }

    /**
     * Create an instance of {@link CreateOneShotKeyResponse }
     * 
     */
    public CreateOneShotKeyResponse createCreateOneShotKeyResponse() {
        return new CreateOneShotKeyResponse();
    }

    /**
     * Create an instance of {@link CancelGuestsAccessToRoomResponse }
     * 
     */
    public CancelGuestsAccessToRoomResponse createCancelGuestsAccessToRoomResponse() {
        return new CancelGuestsAccessToRoomResponse();
    }

    /**
     * Create an instance of {@link MobileTransactionHistory }
     * 
     */
    public MobileTransactionHistory createMobileTransactionHistory() {
        return new MobileTransactionHistory();
    }

    /**
     * Create an instance of {@link CUserNameToken }
     * 
     */
    public CUserNameToken createCUserNameToken() {
        return new CUserNameToken();
    }

    /**
     * Create an instance of {@link CTimestamp }
     * 
     */
    public CTimestamp createCTimestamp() {
        return new CTimestamp();
    }

    /**
     * Create an instance of {@link GetDeviceSecKeysRights }
     * 
     */
    public GetDeviceSecKeysRights createGetDeviceSecKeysRights() {
        return new GetDeviceSecKeysRights();
    }

    /**
     * Create an instance of {@link CSecKeysRequest }
     * 
     */
    public CSecKeysRequest createCSecKeysRequest() {
        return new CSecKeysRequest();
    }

    /**
     * Create an instance of {@link GetDeviceSecKeysRightsResponse.GetDeviceSecKeysRightsResult }
     * 
     */
    public GetDeviceSecKeysRightsResponse.GetDeviceSecKeysRightsResult createGetDeviceSecKeysRightsResponseGetDeviceSecKeysRightsResult() {
        return new GetDeviceSecKeysRightsResponse.GetDeviceSecKeysRightsResult();
    }

    /**
     * Create an instance of {@link AddSharedGuest }
     * 
     */
    public AddSharedGuest createAddSharedGuest() {
        return new AddSharedGuest();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfCCommonAreas }
     * 
     */
    public ArrayOfCCommonAreas createArrayOfCCommonAreas() {
        return new ArrayOfCCommonAreas();
    }

    /**
     * Create an instance of {@link CreateNewBookingResponse.CreateNewBookingResult }
     * 
     */
    public CreateNewBookingResponse.CreateNewBookingResult createCreateNewBookingResponseCreateNewBookingResult() {
        return new CreateNewBookingResponse.CreateNewBookingResult();
    }

    /**
     * Create an instance of {@link ExtendCheckOutResponse.ExtendCheckOutResult }
     * 
     */
    public ExtendCheckOutResponse.ExtendCheckOutResult createExtendCheckOutResponseExtendCheckOutResult() {
        return new ExtendCheckOutResponse.ExtendCheckOutResult();
    }

    /**
     * Create an instance of {@link ChangeGuestAccess }
     * 
     */
    public ChangeGuestAccess createChangeGuestAccess() {
        return new ChangeGuestAccess();
    }

    /**
     * Create an instance of {@link CreateOneShotKey }
     * 
     */
    public CreateOneShotKey createCreateOneShotKey() {
        return new CreateOneShotKey();
    }

    /**
     * Create an instance of {@link MakeUnassignedBookingResponse.MakeUnassignedBookingResult }
     * 
     */
    public MakeUnassignedBookingResponse.MakeUnassignedBookingResult createMakeUnassignedBookingResponseMakeUnassignedBookingResult() {
        return new MakeUnassignedBookingResponse.MakeUnassignedBookingResult();
    }

    /**
     * Create an instance of {@link HelloWorldTest }
     * 
     */
    public HelloWorldTest createHelloWorldTest() {
        return new HelloWorldTest();
    }

    /**
     * Create an instance of {@link CancelGuestsMobileAccessToRoom }
     * 
     */
    public CancelGuestsMobileAccessToRoom createCancelGuestsMobileAccessToRoom() {
        return new CancelGuestsMobileAccessToRoom();
    }

    /**
     * Create an instance of {@link MakeDuplicateKey }
     * 
     */
    public MakeDuplicateKey createMakeDuplicateKey() {
        return new MakeDuplicateKey();
    }

    /**
     * Create an instance of {@link DenyAccessToGuest }
     * 
     */
    public DenyAccessToGuest createDenyAccessToGuest() {
        return new DenyAccessToGuest();
    }

    /**
     * Create an instance of {@link CancelGuestsMobileAccessToRoomResponse.CancelGuestsMobileAccessToRoomResult }
     * 
     */
    public CancelGuestsMobileAccessToRoomResponse.CancelGuestsMobileAccessToRoomResult createCancelGuestsMobileAccessToRoomResponseCancelGuestsMobileAccessToRoomResult() {
        return new CancelGuestsMobileAccessToRoomResponse.CancelGuestsMobileAccessToRoomResult();
    }

    /**
     * Create an instance of {@link PublishResponseComplexTypesResponse.PublishResponseComplexTypesResult }
     * 
     */
    public PublishResponseComplexTypesResponse.PublishResponseComplexTypesResult createPublishResponseComplexTypesResponsePublishResponseComplexTypesResult() {
        return new PublishResponseComplexTypesResponse.PublishResponseComplexTypesResult();
    }

    /**
     * Create an instance of {@link MakeUnassignedBooking }
     * 
     */
    public MakeUnassignedBooking createMakeUnassignedBooking() {
        return new MakeUnassignedBooking();
    }

    /**
     * Create an instance of {@link AuthHeader }
     * 
     */
    public AuthHeader createAuthHeader() {
        return new AuthHeader();
    }

    /**
     * Create an instance of {@link AddGuestAccess }
     * 
     */
    public AddGuestAccess createAddGuestAccess() {
        return new AddGuestAccess();
    }

    /**
     * Create an instance of {@link UnRegisterStaff }
     * 
     */
    public UnRegisterStaff createUnRegisterStaff() {
        return new UnRegisterStaff();
    }

    /**
     * Create an instance of {@link SendKey2StaffMobileDeviceResponse }
     * 
     */
    public SendKey2StaffMobileDeviceResponse createSendKey2StaffMobileDeviceResponse() {
        return new SendKey2StaffMobileDeviceResponse();
    }

    /**
     * Create an instance of {@link CMessengerGuestCreateResponse }
     * 
     */
    public CMessengerGuestCreateResponse createCMessengerGuestCreateResponse() {
        return new CMessengerGuestCreateResponse();
    }

    /**
     * Create an instance of {@link CreateNewBooking }
     * 
     */
    public CreateNewBooking createCreateNewBooking() {
        return new CreateNewBooking();
    }

    /**
     * Create an instance of {@link SendKey2StaffMobileDevice }
     * 
     */
    public SendKey2StaffMobileDevice createSendKey2StaffMobileDevice() {
        return new SendKey2StaffMobileDevice();
    }

    /**
     * Create an instance of {@link DenyAccessToGuestResponse.DenyAccessToGuestResult }
     * 
     */
    public DenyAccessToGuestResponse.DenyAccessToGuestResult createDenyAccessToGuestResponseDenyAccessToGuestResult() {
        return new DenyAccessToGuestResponse.DenyAccessToGuestResult();
    }

    /**
     * Create an instance of {@link ReEstablishAccessToGuest }
     * 
     */
    public ReEstablishAccessToGuest createReEstablishAccessToGuest() {
        return new ReEstablishAccessToGuest();
    }

    /**
     * Create an instance of {@link ChangeKeyAccessResponse.ChangeKeyAccessResult }
     * 
     */
    public ChangeKeyAccessResponse.ChangeKeyAccessResult createChangeKeyAccessResponseChangeKeyAccessResult() {
        return new ChangeKeyAccessResponse.ChangeKeyAccessResult();
    }

    /**
     * Create an instance of {@link CheckOutGuest }
     * 
     */
    public CheckOutGuest createCheckOutGuest() {
        return new CheckOutGuest();
    }

    /**
     * Create an instance of {@link UpdateKeyTransactionStatus }
     * 
     */
    public UpdateKeyTransactionStatus createUpdateKeyTransactionStatus() {
        return new UpdateKeyTransactionStatus();
    }

    /**
     * Create an instance of {@link CheckOutGuestResponse.CheckOutGuestResult }
     * 
     */
    public CheckOutGuestResponse.CheckOutGuestResult createCheckOutGuestResponseCheckOutGuestResult() {
        return new CheckOutGuestResponse.CheckOutGuestResult();
    }

    /**
     * Create an instance of {@link AddGuestAccessResponse.AddGuestAccessResult }
     * 
     */
    public AddGuestAccessResponse.AddGuestAccessResult createAddGuestAccessResponseAddGuestAccessResult() {
        return new AddGuestAccessResponse.AddGuestAccessResult();
    }

    /**
     * Create an instance of {@link MakeDuplicateKeyResponse.MakeDuplicateKeyResult }
     * 
     */
    public MakeDuplicateKeyResponse.MakeDuplicateKeyResult createMakeDuplicateKeyResponseMakeDuplicateKeyResult() {
        return new MakeDuplicateKeyResponse.MakeDuplicateKeyResult();
    }

    /**
     * Create an instance of {@link UnRegisterStaffResponse }
     * 
     */
    public UnRegisterStaffResponse createUnRegisterStaffResponse() {
        return new UnRegisterStaffResponse();
    }

    /**
     * Create an instance of {@link GetMobileTransactionHistoryResponse }
     * 
     */
    public GetMobileTransactionHistoryResponse createGetMobileTransactionHistoryResponse() {
        return new GetMobileTransactionHistoryResponse();
    }

    /**
     * Create an instance of {@link HelloWorldTestResponse }
     * 
     */
    public HelloWorldTestResponse createHelloWorldTestResponse() {
        return new HelloWorldTestResponse();
    }

    /**
     * Create an instance of {@link GetMobileTransactionHistory }
     * 
     */
    public GetMobileTransactionHistory createGetMobileTransactionHistory() {
        return new GetMobileTransactionHistory();
    }

    /**
     * Create an instance of {@link ChangeGuestAccessResponse.ChangeGuestAccessResult }
     * 
     */
    public ChangeGuestAccessResponse.ChangeGuestAccessResult createChangeGuestAccessResponseChangeGuestAccessResult() {
        return new ChangeGuestAccessResponse.ChangeGuestAccessResult();
    }

    /**
     * Create an instance of {@link CancelGuestsAccessToRoom }
     * 
     */
    public CancelGuestsAccessToRoom createCancelGuestsAccessToRoom() {
        return new CancelGuestsAccessToRoom();
    }

    /**
     * Create an instance of {@link ReEstablishAccessToGuestResponse.ReEstablishAccessToGuestResult }
     * 
     */
    public ReEstablishAccessToGuestResponse.ReEstablishAccessToGuestResult createReEstablishAccessToGuestResponseReEstablishAccessToGuestResult() {
        return new ReEstablishAccessToGuestResponse.ReEstablishAccessToGuestResult();
    }

    /**
     * Create an instance of {@link AddSharedGuestResponse.AddSharedGuestResult }
     * 
     */
    public AddSharedGuestResponse.AddSharedGuestResult createAddSharedGuestResponseAddSharedGuestResult() {
        return new AddSharedGuestResponse.AddSharedGuestResult();
    }

    /**
     * Create an instance of {@link PublishFaultListResponse.PublishFaultListResult }
     * 
     */
    public PublishFaultListResponse.PublishFaultListResult createPublishFaultListResponsePublishFaultListResult() {
        return new PublishFaultListResponse.PublishFaultListResult();
    }

    /**
     * Create an instance of {@link PublishResponseComplexTypes }
     * 
     */
    public PublishResponseComplexTypes createPublishResponseComplexTypes() {
        return new PublishResponseComplexTypes();
    }

    /**
     * Create an instance of {@link CMessengerResponse }
     * 
     */
    public CMessengerResponse createCMessengerResponse() {
        return new CMessengerResponse();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link PublishFaultList }
     * 
     */
    public PublishFaultList createPublishFaultList() {
        return new PublishFaultList();
    }

    /**
     * Create an instance of {@link ChangeKeyAccess }
     * 
     */
    public ChangeKeyAccess createChangeKeyAccess() {
        return new ChangeKeyAccess();
    }

    /**
     * Create an instance of {@link ExtendCheckOut }
     * 
     */
    public ExtendCheckOut createExtendCheckOut() {
        return new ExtendCheckOut();
    }

    /**
     * Create an instance of {@link UpdateKeyTransactionStatusResponse.UpdateKeyTransactionStatusResult }
     * 
     */
    public UpdateKeyTransactionStatusResponse.UpdateKeyTransactionStatusResult createUpdateKeyTransactionStatusResponseUpdateKeyTransactionStatusResult() {
        return new UpdateKeyTransactionStatusResponse.UpdateKeyTransactionStatusResult();
    }

    /**
     * Create an instance of {@link CreateOneShotKeyResponse.CreateOneShotKeyResult }
     * 
     */
    public CreateOneShotKeyResponse.CreateOneShotKeyResult createCreateOneShotKeyResponseCreateOneShotKeyResult() {
        return new CreateOneShotKeyResponse.CreateOneShotKeyResult();
    }

    /**
     * Create an instance of {@link CancelGuestsAccessToRoomResponse.CancelGuestsAccessToRoomResult }
     * 
     */
    public CancelGuestsAccessToRoomResponse.CancelGuestsAccessToRoomResult createCancelGuestsAccessToRoomResponseCancelGuestsAccessToRoomResult() {
        return new CancelGuestsAccessToRoomResponse.CancelGuestsAccessToRoomResult();
    }

    /**
     * Create an instance of {@link TransactionStatusHistory }
     * 
     */
    public TransactionStatusHistory createTransactionStatusHistory() {
        return new TransactionStatusHistory();
    }

    /**
     * Create an instance of {@link CCommonAreas }
     * 
     */
    public CCommonAreas createCCommonAreas() {
        return new CCommonAreas();
    }

    /**
     * Create an instance of {@link SecurityHeader }
     * 
     */
    public SecurityHeader createSecurityHeader() {
        return new SecurityHeader();
    }

    /**
     * Create an instance of {@link CMessengerBaseResponse }
     * 
     */
    public CMessengerBaseResponse createCMessengerBaseResponse() {
        return new CMessengerBaseResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionStatusHistory }
     * 
     */
    public ArrayOfTransactionStatusHistory createArrayOfTransactionStatusHistory() {
        return new ArrayOfTransactionStatusHistory();
    }

    /**
     * Create an instance of {@link MobileTransactionHistory.RequestStatus }
     * 
     */
    public MobileTransactionHistory.RequestStatus createMobileTransactionHistoryRequestStatus() {
        return new MobileTransactionHistory.RequestStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "Action")
    public JAXBElement<String> createAction(String value) {
        return new JAXBElement<String>(_Action_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "MainRoomNo")
    public JAXBElement<String> createMainRoomNo(String value) {
        return new JAXBElement<String>(_MainRoomNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "GuestName")
    public JAXBElement<String> createGuestName(String value) {
        return new JAXBElement<String>(_GuestName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "MessageID")
    public JAXBElement<String> createMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "To")
    public JAXBElement<String> createTo(String value) {
        return new JAXBElement<String>(_To_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org", name = "AuthHeader")
    public JAXBElement<AuthHeader> createAuthHeader(AuthHeader value) {
        return new JAXBElement<AuthHeader>(_AuthHeader_QNAME, AuthHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing/role/anonymous", name = "ReplyTo")
    public JAXBElement<String> createReplyTo(String value) {
        return new JAXBElement<String>(_ReplyTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTimestamp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Timestamp")
    public JAXBElement<CTimestamp> createTimestamp(CTimestamp value) {
        return new JAXBElement<CTimestamp>(_Timestamp_QNAME, CTimestamp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUserNameToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "UsernameToken")
    public JAXBElement<CUserNameToken> createUsernameToken(CUserNameToken value) {
        return new JAXBElement<CUserNameToken>(_UsernameToken_QNAME, CUserNameToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "From")
    public JAXBElement<String> createFrom(String value) {
        return new JAXBElement<String>(_From_QNAME, String.class, null, value);
    }

}
