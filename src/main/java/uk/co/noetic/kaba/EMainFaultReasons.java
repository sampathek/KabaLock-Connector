
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eMainFaultReasons.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eMainFaultReasons">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EncoderMsg"/>
 *     &lt;enumeration value="UserCredentialsNotProvided"/>
 *     &lt;enumeration value="MessengerPMSServiceNoResponse"/>
 *     &lt;enumeration value="InvalidWSParameter"/>
 *     &lt;enumeration value="ExceptionRequestFailed"/>
 *     &lt;enumeration value="NoCallerID"/>
 *     &lt;enumeration value="NoRequestMsg"/>
 *     &lt;enumeration value="BusyProcessingPreviousRequest"/>
 *     &lt;enumeration value="CallerRequestWasLost"/>
 *     &lt;enumeration value="CallerRequestNotTheSame"/>
 *     &lt;enumeration value="RoomNumberNotFound"/>
 *     &lt;enumeration value="MaxSharedReached"/>
 *     &lt;enumeration value="FailedSetReservation"/>
 *     &lt;enumeration value="UnableToRegisterSessionForPMSTerminalID"/>
 *     &lt;enumeration value="UnableToSetPMSOperationNoInDB"/>
 *     &lt;enumeration value="ReservationNoInvalid"/>
 *     &lt;enumeration value="ReservationNoSuspended"/>
 *     &lt;enumeration value="UnassignDuplicateToNoneExistingReservation"/>
 *     &lt;enumeration value="MaxUnassignReached"/>
 *     &lt;enumeration value="SharedWithMustHaveExistingStay"/>
 *     &lt;enumeration value="GuestLevelNotAvailableInAllRooms"/>
 *     &lt;enumeration value="ReservationNotFound"/>
 *     &lt;enumeration value="RoomMoveMustHaveSameStay"/>
 *     &lt;enumeration value="NoActionRequired"/>
 *     &lt;enumeration value="ReservationHasExpired"/>
 *     &lt;enumeration value="UnableToChangeReservationInfo"/>
 *     &lt;enumeration value="UnableToChangeReservationKeyInfo"/>
 *     &lt;enumeration value="RequestTimeoutNoResponse"/>
 *     &lt;enumeration value="RoomNameNotSet"/>
 *     &lt;enumeration value="UnableToCompleteReservation"/>
 *     &lt;enumeration value="AuthHeaderNotRecognized"/>
 *     &lt;enumeration value="NoSharewithForSuites"/>
 *     &lt;enumeration value="ReservationCheckedOut"/>
 *     &lt;enumeration value="RoomMustHaveSameStay"/>
 *     &lt;enumeration value="CannotCreateKeyForThisRoomType"/>
 *     &lt;enumeration value="KeyInstanceNotFound"/>
 *     &lt;enumeration value="InvalidVIPRequestInfo"/>
 *     &lt;enumeration value="UnableToSendMessageToLock"/>
 *     &lt;enumeration value="RoomOFFLine"/>
 *     &lt;enumeration value="IRSConnectionLost"/>
 *     &lt;enumeration value="KABALodginInterfaceExceptionRaised"/>
 *     &lt;enumeration value="KABALodgingInterfaceOperationNotSupported"/>
 *     &lt;enumeration value="SecuredKeyProductLineNotSupported"/>
 *     &lt;enumeration value="SecuredKeyDeviceUIDEmpty"/>
 *     &lt;enumeration value="SecuredKeyDeviceUIDLengthInvalid"/>
 *     &lt;enumeration value="SecuredKeyDeviceUIDZeroOnly"/>
 *     &lt;enumeration value="InvalidHexValue"/>
 *     &lt;enumeration value="EmptyPhoneNumber"/>
 *     &lt;enumeration value="PhoneNumberTooSmall"/>
 *     &lt;enumeration value="UnableToDeliverToPhone"/>
 *     &lt;enumeration value="ExceptionFault"/>
 *     &lt;enumeration value="UndefinedFault"/>
 *     &lt;enumeration value="NoFault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eMainFaultReasons")
@XmlEnum
public enum EMainFaultReasons {

    @XmlEnumValue("EncoderMsg")
    ENCODER_MSG("EncoderMsg"),
    @XmlEnumValue("UserCredentialsNotProvided")
    USER_CREDENTIALS_NOT_PROVIDED("UserCredentialsNotProvided"),
    @XmlEnumValue("MessengerPMSServiceNoResponse")
    MESSENGER_PMS_SERVICE_NO_RESPONSE("MessengerPMSServiceNoResponse"),
    @XmlEnumValue("InvalidWSParameter")
    INVALID_WS_PARAMETER("InvalidWSParameter"),
    @XmlEnumValue("ExceptionRequestFailed")
    EXCEPTION_REQUEST_FAILED("ExceptionRequestFailed"),
    @XmlEnumValue("NoCallerID")
    NO_CALLER_ID("NoCallerID"),
    @XmlEnumValue("NoRequestMsg")
    NO_REQUEST_MSG("NoRequestMsg"),
    @XmlEnumValue("BusyProcessingPreviousRequest")
    BUSY_PROCESSING_PREVIOUS_REQUEST("BusyProcessingPreviousRequest"),
    @XmlEnumValue("CallerRequestWasLost")
    CALLER_REQUEST_WAS_LOST("CallerRequestWasLost"),
    @XmlEnumValue("CallerRequestNotTheSame")
    CALLER_REQUEST_NOT_THE_SAME("CallerRequestNotTheSame"),
    @XmlEnumValue("RoomNumberNotFound")
    ROOM_NUMBER_NOT_FOUND("RoomNumberNotFound"),
    @XmlEnumValue("MaxSharedReached")
    MAX_SHARED_REACHED("MaxSharedReached"),
    @XmlEnumValue("FailedSetReservation")
    FAILED_SET_RESERVATION("FailedSetReservation"),
    @XmlEnumValue("UnableToRegisterSessionForPMSTerminalID")
    UNABLE_TO_REGISTER_SESSION_FOR_PMS_TERMINAL_ID("UnableToRegisterSessionForPMSTerminalID"),
    @XmlEnumValue("UnableToSetPMSOperationNoInDB")
    UNABLE_TO_SET_PMS_OPERATION_NO_IN_DB("UnableToSetPMSOperationNoInDB"),
    @XmlEnumValue("ReservationNoInvalid")
    RESERVATION_NO_INVALID("ReservationNoInvalid"),
    @XmlEnumValue("ReservationNoSuspended")
    RESERVATION_NO_SUSPENDED("ReservationNoSuspended"),
    @XmlEnumValue("UnassignDuplicateToNoneExistingReservation")
    UNASSIGN_DUPLICATE_TO_NONE_EXISTING_RESERVATION("UnassignDuplicateToNoneExistingReservation"),
    @XmlEnumValue("MaxUnassignReached")
    MAX_UNASSIGN_REACHED("MaxUnassignReached"),
    @XmlEnumValue("SharedWithMustHaveExistingStay")
    SHARED_WITH_MUST_HAVE_EXISTING_STAY("SharedWithMustHaveExistingStay"),
    @XmlEnumValue("GuestLevelNotAvailableInAllRooms")
    GUEST_LEVEL_NOT_AVAILABLE_IN_ALL_ROOMS("GuestLevelNotAvailableInAllRooms"),
    @XmlEnumValue("ReservationNotFound")
    RESERVATION_NOT_FOUND("ReservationNotFound"),
    @XmlEnumValue("RoomMoveMustHaveSameStay")
    ROOM_MOVE_MUST_HAVE_SAME_STAY("RoomMoveMustHaveSameStay"),
    @XmlEnumValue("NoActionRequired")
    NO_ACTION_REQUIRED("NoActionRequired"),
    @XmlEnumValue("ReservationHasExpired")
    RESERVATION_HAS_EXPIRED("ReservationHasExpired"),
    @XmlEnumValue("UnableToChangeReservationInfo")
    UNABLE_TO_CHANGE_RESERVATION_INFO("UnableToChangeReservationInfo"),
    @XmlEnumValue("UnableToChangeReservationKeyInfo")
    UNABLE_TO_CHANGE_RESERVATION_KEY_INFO("UnableToChangeReservationKeyInfo"),
    @XmlEnumValue("RequestTimeoutNoResponse")
    REQUEST_TIMEOUT_NO_RESPONSE("RequestTimeoutNoResponse"),
    @XmlEnumValue("RoomNameNotSet")
    ROOM_NAME_NOT_SET("RoomNameNotSet"),
    @XmlEnumValue("UnableToCompleteReservation")
    UNABLE_TO_COMPLETE_RESERVATION("UnableToCompleteReservation"),
    @XmlEnumValue("AuthHeaderNotRecognized")
    AUTH_HEADER_NOT_RECOGNIZED("AuthHeaderNotRecognized"),
    @XmlEnumValue("NoSharewithForSuites")
    NO_SHAREWITH_FOR_SUITES("NoSharewithForSuites"),
    @XmlEnumValue("ReservationCheckedOut")
    RESERVATION_CHECKED_OUT("ReservationCheckedOut"),
    @XmlEnumValue("RoomMustHaveSameStay")
    ROOM_MUST_HAVE_SAME_STAY("RoomMustHaveSameStay"),
    @XmlEnumValue("CannotCreateKeyForThisRoomType")
    CANNOT_CREATE_KEY_FOR_THIS_ROOM_TYPE("CannotCreateKeyForThisRoomType"),
    @XmlEnumValue("KeyInstanceNotFound")
    KEY_INSTANCE_NOT_FOUND("KeyInstanceNotFound"),
    @XmlEnumValue("InvalidVIPRequestInfo")
    INVALID_VIP_REQUEST_INFO("InvalidVIPRequestInfo"),
    @XmlEnumValue("UnableToSendMessageToLock")
    UNABLE_TO_SEND_MESSAGE_TO_LOCK("UnableToSendMessageToLock"),
    @XmlEnumValue("RoomOFFLine")
    ROOM_OFF_LINE("RoomOFFLine"),
    @XmlEnumValue("IRSConnectionLost")
    IRS_CONNECTION_LOST("IRSConnectionLost"),
    @XmlEnumValue("KABALodginInterfaceExceptionRaised")
    KABA_LODGIN_INTERFACE_EXCEPTION_RAISED("KABALodginInterfaceExceptionRaised"),
    @XmlEnumValue("KABALodgingInterfaceOperationNotSupported")
    KABA_LODGING_INTERFACE_OPERATION_NOT_SUPPORTED("KABALodgingInterfaceOperationNotSupported"),
    @XmlEnumValue("SecuredKeyProductLineNotSupported")
    SECURED_KEY_PRODUCT_LINE_NOT_SUPPORTED("SecuredKeyProductLineNotSupported"),
    @XmlEnumValue("SecuredKeyDeviceUIDEmpty")
    SECURED_KEY_DEVICE_UID_EMPTY("SecuredKeyDeviceUIDEmpty"),
    @XmlEnumValue("SecuredKeyDeviceUIDLengthInvalid")
    SECURED_KEY_DEVICE_UID_LENGTH_INVALID("SecuredKeyDeviceUIDLengthInvalid"),
    @XmlEnumValue("SecuredKeyDeviceUIDZeroOnly")
    SECURED_KEY_DEVICE_UID_ZERO_ONLY("SecuredKeyDeviceUIDZeroOnly"),
    @XmlEnumValue("InvalidHexValue")
    INVALID_HEX_VALUE("InvalidHexValue"),
    @XmlEnumValue("EmptyPhoneNumber")
    EMPTY_PHONE_NUMBER("EmptyPhoneNumber"),
    @XmlEnumValue("PhoneNumberTooSmall")
    PHONE_NUMBER_TOO_SMALL("PhoneNumberTooSmall"),
    @XmlEnumValue("UnableToDeliverToPhone")
    UNABLE_TO_DELIVER_TO_PHONE("UnableToDeliverToPhone"),
    @XmlEnumValue("ExceptionFault")
    EXCEPTION_FAULT("ExceptionFault"),
    @XmlEnumValue("UndefinedFault")
    UNDEFINED_FAULT("UndefinedFault"),
    @XmlEnumValue("NoFault")
    NO_FAULT("NoFault");
    private final String value;

    EMainFaultReasons(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EMainFaultReasons fromValue(String v) {
        for (EMainFaultReasons c: EMainFaultReasons.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
