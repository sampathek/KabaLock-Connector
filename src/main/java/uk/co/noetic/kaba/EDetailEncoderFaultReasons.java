
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eDetailEncoderFaultReasons.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eDetailEncoderFaultReasons">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="EncoderResponse"/>
 *     &lt;enumeration value="GeneralSystemError"/>
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="ConfirmKeyCancel"/>
 *     &lt;enumeration value="ConfirmKeyDuplicate"/>
 *     &lt;enumeration value="ConfirmExpireBeforeCheckout"/>
 *     &lt;enumeration value="MaxDuplicatesMadeReached"/>
 *     &lt;enumeration value="ConfirmCheckBackIn"/>
 *     &lt;enumeration value="EncoderNotOnlineOrNotExist"/>
 *     &lt;enumeration value="EncoderNotResponding"/>
 *     &lt;enumeration value="InvalidEncoderNumber"/>
 *     &lt;enumeration value="EncoderMemoryError"/>
 *     &lt;enumeration value="EncoderBusy"/>
 *     &lt;enumeration value="TransactionTypeNotAvailable"/>
 *     &lt;enumeration value="TransactionNotSupportKeyLevel"/>
 *     &lt;enumeration value="InternalSoftwareErrorCompatibility"/>
 *     &lt;enumeration value="TransactionTypeInvalid"/>
 *     &lt;enumeration value="InsufficientPasswordLength"/>
 *     &lt;enumeration value="PasswordInvalid"/>
 *     &lt;enumeration value="TransactionUnauthorized"/>
 *     &lt;enumeration value="InternalSoftwareErrorDataFiles"/>
 *     &lt;enumeration value="TransactionKeyLevelNotAavailable"/>
 *     &lt;enumeration value="InternalSoftwareErrorKeyFiles"/>
 *     &lt;enumeration value="InternalSoftwareBusyArchiving"/>
 *     &lt;enumeration value="TransactionKeyNumberNotAavailable"/>
 *     &lt;enumeration value="TransactionKeyNumberIncorrectFormat"/>
 *     &lt;enumeration value="TransactionUnauthorizedKey"/>
 *     &lt;enumeration value="InvalidTransactionRequest"/>
 *     &lt;enumeration value="InvalidPMSTerminalNumber"/>
 *     &lt;enumeration value="TransactionKeyNumberOutOfRange"/>
 *     &lt;enumeration value="TransactionKeyNumberNotNumeric"/>
 *     &lt;enumeration value="TransactionKeyNumberNULL"/>
 *     &lt;enumeration value="InvalidPMSRequestDate"/>
 *     &lt;enumeration value="InvalidPMSRequestTime"/>
 *     &lt;enumeration value="TransactionEncoderNumberOutOfRange"/>
 *     &lt;enumeration value="TransactionKeyNumberOfKeysZERO"/>
 *     &lt;enumeration value="InvalidPMSResponse"/>
 *     &lt;enumeration value="UnableToProcessRequest"/>
 *     &lt;enumeration value="UnableToProcessLostRequest"/>
 *     &lt;enumeration value="TimeoutWaitingResponse"/>
 *     &lt;enumeration value="TimeoutGeneralComError"/>
 *     &lt;enumeration value="InvalidEncoderReqTerminated"/>
 *     &lt;enumeration value="ErrorNotOverridenReqTerminated"/>
 *     &lt;enumeration value="IncompatiblePMSInterface"/>
 *     &lt;enumeration value="TransactionKeyNotValid"/>
 *     &lt;enumeration value="TransactionKeyAndLevelNotValid"/>
 *     &lt;enumeration value="TransactionRequestWasLost"/>
 *     &lt;enumeration value="InvalidTransactionTypeReceived"/>
 *     &lt;enumeration value="InvalidGRCCode"/>
 *     &lt;enumeration value="InvalidPassOption"/>
 *     &lt;enumeration value="InvalidPassNumber"/>
 *     &lt;enumeration value="InvalidNumberOfSeconds"/>
 *     &lt;enumeration value="InvalidDestinationTerminalNumber"/>
 *     &lt;enumeration value="InvalidNumericField"/>
 *     &lt;enumeration value="SystemErrorFailed"/>
 *     &lt;enumeration value="InternalMemoryTimeoutError"/>
 *     &lt;enumeration value="InternalSyncTimeoutError"/>
 *     &lt;enumeration value="TransactionLockKeyInaccessible"/>
 *     &lt;enumeration value="TransactionKeyInaccessible"/>
 *     &lt;enumeration value="RequestWasAborted"/>
 *     &lt;enumeration value="TimeoutWaitingKey"/>
 *     &lt;enumeration value="KeyJammed"/>
 *     &lt;enumeration value="KeyNotFaceUp"/>
 *     &lt;enumeration value="KeyMaybeDamaged"/>
 *     &lt;enumeration value="EncoderNoResponse"/>
 *     &lt;enumeration value="KeyNotPreRegistered"/>
 *     &lt;enumeration value="CheckoutDateLessThanSystemDate"/>
 *     &lt;enumeration value="KeyExpirationInFuture"/>
 *     &lt;enumeration value="KeyExpirationInPast"/>
 *     &lt;enumeration value="MustProvidePassLevelNo"/>
 *     &lt;enumeration value="PassNumberIsInvalid"/>
 *     &lt;enumeration value="UnableToCreateKeyNewSequenceRequired"/>
 *     &lt;enumeration value="UnableToProcessVerifyGuestKey"/>
 *     &lt;enumeration value="InternalPollingError"/>
 *     &lt;enumeration value="InternalOnlineError"/>
 *     &lt;enumeration value="InternalKeyDataFilesCorrupted"/>
 *     &lt;enumeration value="InternalSystemResponseError"/>
 *     &lt;enumeration value="InternalSystemStartupBusy"/>
 *     &lt;enumeration value="InternalSystemBusyClearing"/>
 *     &lt;enumeration value="InternalSystemExecError"/>
 *     &lt;enumeration value="InternalSystemErrorUnableToProcessRequests"/>
 *     &lt;enumeration value="InternalSystemErrorDriveAccessProblem"/>
 *     &lt;enumeration value="InternalSystemErrorTimeoutToProcessRequests"/>
 *     &lt;enumeration value="InternalSystemErrorFileDeletion"/>
 *     &lt;enumeration value="InternalSystemErrorFileCorrupted"/>
 *     &lt;enumeration value="InternalSystemErrorMemoryProblem"/>
 *     &lt;enumeration value="InternalSystemErrorClockProblem"/>
 *     &lt;enumeration value="InternalSystemErrorOverflowProblem"/>
 *     &lt;enumeration value="InternalSystemFilePointerProblem"/>
 *     &lt;enumeration value="InternalSystemOutOfDiskSpaceProblem"/>
 *     &lt;enumeration value="InternalSystemFileWriteProblem"/>
 *     &lt;enumeration value="InternalSystemFileNotFoundProblem"/>
 *     &lt;enumeration value="InternalSystemFileNotReadableProblem"/>
 *     &lt;enumeration value="VIP_None"/>
 *     &lt;enumeration value="VIP_Success"/>
 *     &lt;enumeration value="VIP_CREATE_LOGFILE_FAILED"/>
 *     &lt;enumeration value="VIP_INVALID_COMMAND"/>
 *     &lt;enumeration value="VIP_INITIALIZATION_FAILED"/>
 *     &lt;enumeration value="VIP_REQUEST_STATUS_FAILED"/>
 *     &lt;enumeration value="VIP_WRITE_ERROR"/>
 *     &lt;enumeration value="VIP_WRITE_TIMEOUT"/>
 *     &lt;enumeration value="VIP_READ_ERROR"/>
 *     &lt;enumeration value="VIP_CARD_AUTH_FAILED"/>
 *     &lt;enumeration value="VIP_READ_TIMEOUT"/>
 *     &lt;enumeration value="VIP_UNKNOWN_CARD_FORMAT"/>
 *     &lt;enumeration value="VIP_INVALID_SECTOR"/>
 *     &lt;enumeration value="VIP_CARD_NOT_FORMATED"/>
 *     &lt;enumeration value="VIP_ENCODER_FAILURE"/>
 *     &lt;enumeration value="VIP_ENCODER_CONNECT_FAILED"/>
 *     &lt;enumeration value="VIP_ENCODER_DISCONNECT_FAILED"/>
 *     &lt;enumeration value="VIP_NOT_SAFLOK_PUBLISHER"/>
 *     &lt;enumeration value="VIP_NO_CARD_PRESENT"/>
 *     &lt;enumeration value="VIP_TOO_MUCH_CARDS"/>
 *     &lt;enumeration value="VIP_NO_FREE_SECTORS"/>
 *     &lt;enumeration value="VIP_NO_TAGS_FOUND"/>
 *     &lt;enumeration value="VIP_RequestConfirmationToOverwriteKey"/>
 *     &lt;enumeration value="VIP_FatalErrorWithEViewer"/>
 *     &lt;enumeration value="VIP_DataNotFound"/>
 *     &lt;enumeration value="VIP_EncoderBusy"/>
 *     &lt;enumeration value="VIP_Failed"/>
 *     &lt;enumeration value="IncorrectVIPNumberFormat"/>
 *     &lt;enumeration value="VIPNumberFailedToBuild"/>
 *     &lt;enumeration value="VIPExceptionRaised"/>
 *     &lt;enumeration value="VIP_EROR_KeyConfigData"/>
 *     &lt;enumeration value="OperationNotSupported"/>
 *     &lt;enumeration value="KABALodgingInterfaceTranslationError"/>
 *     &lt;enumeration value="KABALodgingInterfaceWSURLError"/>
 *     &lt;enumeration value="KABALodgingInterfaceCredentialError"/>
 *     &lt;enumeration value="KABALodgingInterfaceExceptionRaised"/>
 *     &lt;enumeration value="ATLASExceptionRaised"/>
 *     &lt;enumeration value="ATLASIllegalCmdRcv"/>
 *     &lt;enumeration value="ATLASIllegalField"/>
 *     &lt;enumeration value="ATLASEncoderError"/>
 *     &lt;enumeration value="ATLASReaderError"/>
 *     &lt;enumeration value="ATLASInsufficientData"/>
 *     &lt;enumeration value="ATLASTooMuchData"/>
 *     &lt;enumeration value="ATLASInvalidRoomNo"/>
 *     &lt;enumeration value="ATLASInvalidAuthorization"/>
 *     &lt;enumeration value="ATLASCardNotInserted"/>
 *     &lt;enumeration value="ATLASCheckInOutOfRange"/>
 *     &lt;enumeration value="ATLASCheckInLargerCheckOut"/>
 *     &lt;enumeration value="ATLASCheckInSmallerCreation"/>
 *     &lt;enumeration value="ATLASNoInnerDoorsSelected"/>
 *     &lt;enumeration value="ATLASInvalidExpiry"/>
 *     &lt;enumeration value="ATLASNotGuestCard"/>
 *     &lt;enumeration value="ATLASFailed"/>
 *     &lt;enumeration value="ATLASHigherAuthorizarionNeeded"/>
 *     &lt;enumeration value="ATLASRoomNoOutOfRange"/>
 *     &lt;enumeration value="ATLASDisabledFunction"/>
 *     &lt;enumeration value="ATLASInvalidDeviceAddress"/>
 *     &lt;enumeration value="ATLASDeviceBusy"/>
 *     &lt;enumeration value="ATLASDeviceInactive"/>
 *     &lt;enumeration value="ATLASCommFailure"/>
 *     &lt;enumeration value="ATLASDecodingError"/>
 *     &lt;enumeration value="ATLASCardNotSupported"/>
 *     &lt;enumeration value="ATLASInvalidCreation"/>
 *     &lt;enumeration value="ATLASInvalidCheckIn"/>
 *     &lt;enumeration value="ATLASInvalidCoercivity"/>
 *     &lt;enumeration value="ATLASUnsupportedCoercivity"/>
 *     &lt;enumeration value="KDSFail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eDetailEncoderFaultReasons")
@XmlEnum
public enum EDetailEncoderFaultReasons {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("EncoderResponse")
    ENCODER_RESPONSE("EncoderResponse"),
    @XmlEnumValue("GeneralSystemError")
    GENERAL_SYSTEM_ERROR("GeneralSystemError"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("ConfirmKeyCancel")
    CONFIRM_KEY_CANCEL("ConfirmKeyCancel"),
    @XmlEnumValue("ConfirmKeyDuplicate")
    CONFIRM_KEY_DUPLICATE("ConfirmKeyDuplicate"),
    @XmlEnumValue("ConfirmExpireBeforeCheckout")
    CONFIRM_EXPIRE_BEFORE_CHECKOUT("ConfirmExpireBeforeCheckout"),
    @XmlEnumValue("MaxDuplicatesMadeReached")
    MAX_DUPLICATES_MADE_REACHED("MaxDuplicatesMadeReached"),
    @XmlEnumValue("ConfirmCheckBackIn")
    CONFIRM_CHECK_BACK_IN("ConfirmCheckBackIn"),
    @XmlEnumValue("EncoderNotOnlineOrNotExist")
    ENCODER_NOT_ONLINE_OR_NOT_EXIST("EncoderNotOnlineOrNotExist"),
    @XmlEnumValue("EncoderNotResponding")
    ENCODER_NOT_RESPONDING("EncoderNotResponding"),
    @XmlEnumValue("InvalidEncoderNumber")
    INVALID_ENCODER_NUMBER("InvalidEncoderNumber"),
    @XmlEnumValue("EncoderMemoryError")
    ENCODER_MEMORY_ERROR("EncoderMemoryError"),
    @XmlEnumValue("EncoderBusy")
    ENCODER_BUSY("EncoderBusy"),
    @XmlEnumValue("TransactionTypeNotAvailable")
    TRANSACTION_TYPE_NOT_AVAILABLE("TransactionTypeNotAvailable"),
    @XmlEnumValue("TransactionNotSupportKeyLevel")
    TRANSACTION_NOT_SUPPORT_KEY_LEVEL("TransactionNotSupportKeyLevel"),
    @XmlEnumValue("InternalSoftwareErrorCompatibility")
    INTERNAL_SOFTWARE_ERROR_COMPATIBILITY("InternalSoftwareErrorCompatibility"),
    @XmlEnumValue("TransactionTypeInvalid")
    TRANSACTION_TYPE_INVALID("TransactionTypeInvalid"),
    @XmlEnumValue("InsufficientPasswordLength")
    INSUFFICIENT_PASSWORD_LENGTH("InsufficientPasswordLength"),
    @XmlEnumValue("PasswordInvalid")
    PASSWORD_INVALID("PasswordInvalid"),
    @XmlEnumValue("TransactionUnauthorized")
    TRANSACTION_UNAUTHORIZED("TransactionUnauthorized"),
    @XmlEnumValue("InternalSoftwareErrorDataFiles")
    INTERNAL_SOFTWARE_ERROR_DATA_FILES("InternalSoftwareErrorDataFiles"),
    @XmlEnumValue("TransactionKeyLevelNotAavailable")
    TRANSACTION_KEY_LEVEL_NOT_AAVAILABLE("TransactionKeyLevelNotAavailable"),
    @XmlEnumValue("InternalSoftwareErrorKeyFiles")
    INTERNAL_SOFTWARE_ERROR_KEY_FILES("InternalSoftwareErrorKeyFiles"),
    @XmlEnumValue("InternalSoftwareBusyArchiving")
    INTERNAL_SOFTWARE_BUSY_ARCHIVING("InternalSoftwareBusyArchiving"),
    @XmlEnumValue("TransactionKeyNumberNotAavailable")
    TRANSACTION_KEY_NUMBER_NOT_AAVAILABLE("TransactionKeyNumberNotAavailable"),
    @XmlEnumValue("TransactionKeyNumberIncorrectFormat")
    TRANSACTION_KEY_NUMBER_INCORRECT_FORMAT("TransactionKeyNumberIncorrectFormat"),
    @XmlEnumValue("TransactionUnauthorizedKey")
    TRANSACTION_UNAUTHORIZED_KEY("TransactionUnauthorizedKey"),
    @XmlEnumValue("InvalidTransactionRequest")
    INVALID_TRANSACTION_REQUEST("InvalidTransactionRequest"),
    @XmlEnumValue("InvalidPMSTerminalNumber")
    INVALID_PMS_TERMINAL_NUMBER("InvalidPMSTerminalNumber"),
    @XmlEnumValue("TransactionKeyNumberOutOfRange")
    TRANSACTION_KEY_NUMBER_OUT_OF_RANGE("TransactionKeyNumberOutOfRange"),
    @XmlEnumValue("TransactionKeyNumberNotNumeric")
    TRANSACTION_KEY_NUMBER_NOT_NUMERIC("TransactionKeyNumberNotNumeric"),
    @XmlEnumValue("TransactionKeyNumberNULL")
    TRANSACTION_KEY_NUMBER_NULL("TransactionKeyNumberNULL"),
    @XmlEnumValue("InvalidPMSRequestDate")
    INVALID_PMS_REQUEST_DATE("InvalidPMSRequestDate"),
    @XmlEnumValue("InvalidPMSRequestTime")
    INVALID_PMS_REQUEST_TIME("InvalidPMSRequestTime"),
    @XmlEnumValue("TransactionEncoderNumberOutOfRange")
    TRANSACTION_ENCODER_NUMBER_OUT_OF_RANGE("TransactionEncoderNumberOutOfRange"),
    @XmlEnumValue("TransactionKeyNumberOfKeysZERO")
    TRANSACTION_KEY_NUMBER_OF_KEYS_ZERO("TransactionKeyNumberOfKeysZERO"),
    @XmlEnumValue("InvalidPMSResponse")
    INVALID_PMS_RESPONSE("InvalidPMSResponse"),
    @XmlEnumValue("UnableToProcessRequest")
    UNABLE_TO_PROCESS_REQUEST("UnableToProcessRequest"),
    @XmlEnumValue("UnableToProcessLostRequest")
    UNABLE_TO_PROCESS_LOST_REQUEST("UnableToProcessLostRequest"),
    @XmlEnumValue("TimeoutWaitingResponse")
    TIMEOUT_WAITING_RESPONSE("TimeoutWaitingResponse"),
    @XmlEnumValue("TimeoutGeneralComError")
    TIMEOUT_GENERAL_COM_ERROR("TimeoutGeneralComError"),
    @XmlEnumValue("InvalidEncoderReqTerminated")
    INVALID_ENCODER_REQ_TERMINATED("InvalidEncoderReqTerminated"),
    @XmlEnumValue("ErrorNotOverridenReqTerminated")
    ERROR_NOT_OVERRIDEN_REQ_TERMINATED("ErrorNotOverridenReqTerminated"),
    @XmlEnumValue("IncompatiblePMSInterface")
    INCOMPATIBLE_PMS_INTERFACE("IncompatiblePMSInterface"),
    @XmlEnumValue("TransactionKeyNotValid")
    TRANSACTION_KEY_NOT_VALID("TransactionKeyNotValid"),
    @XmlEnumValue("TransactionKeyAndLevelNotValid")
    TRANSACTION_KEY_AND_LEVEL_NOT_VALID("TransactionKeyAndLevelNotValid"),
    @XmlEnumValue("TransactionRequestWasLost")
    TRANSACTION_REQUEST_WAS_LOST("TransactionRequestWasLost"),
    @XmlEnumValue("InvalidTransactionTypeReceived")
    INVALID_TRANSACTION_TYPE_RECEIVED("InvalidTransactionTypeReceived"),
    @XmlEnumValue("InvalidGRCCode")
    INVALID_GRC_CODE("InvalidGRCCode"),
    @XmlEnumValue("InvalidPassOption")
    INVALID_PASS_OPTION("InvalidPassOption"),
    @XmlEnumValue("InvalidPassNumber")
    INVALID_PASS_NUMBER("InvalidPassNumber"),
    @XmlEnumValue("InvalidNumberOfSeconds")
    INVALID_NUMBER_OF_SECONDS("InvalidNumberOfSeconds"),
    @XmlEnumValue("InvalidDestinationTerminalNumber")
    INVALID_DESTINATION_TERMINAL_NUMBER("InvalidDestinationTerminalNumber"),
    @XmlEnumValue("InvalidNumericField")
    INVALID_NUMERIC_FIELD("InvalidNumericField"),
    @XmlEnumValue("SystemErrorFailed")
    SYSTEM_ERROR_FAILED("SystemErrorFailed"),
    @XmlEnumValue("InternalMemoryTimeoutError")
    INTERNAL_MEMORY_TIMEOUT_ERROR("InternalMemoryTimeoutError"),
    @XmlEnumValue("InternalSyncTimeoutError")
    INTERNAL_SYNC_TIMEOUT_ERROR("InternalSyncTimeoutError"),
    @XmlEnumValue("TransactionLockKeyInaccessible")
    TRANSACTION_LOCK_KEY_INACCESSIBLE("TransactionLockKeyInaccessible"),
    @XmlEnumValue("TransactionKeyInaccessible")
    TRANSACTION_KEY_INACCESSIBLE("TransactionKeyInaccessible"),
    @XmlEnumValue("RequestWasAborted")
    REQUEST_WAS_ABORTED("RequestWasAborted"),
    @XmlEnumValue("TimeoutWaitingKey")
    TIMEOUT_WAITING_KEY("TimeoutWaitingKey"),
    @XmlEnumValue("KeyJammed")
    KEY_JAMMED("KeyJammed"),
    @XmlEnumValue("KeyNotFaceUp")
    KEY_NOT_FACE_UP("KeyNotFaceUp"),
    @XmlEnumValue("KeyMaybeDamaged")
    KEY_MAYBE_DAMAGED("KeyMaybeDamaged"),
    @XmlEnumValue("EncoderNoResponse")
    ENCODER_NO_RESPONSE("EncoderNoResponse"),
    @XmlEnumValue("KeyNotPreRegistered")
    KEY_NOT_PRE_REGISTERED("KeyNotPreRegistered"),
    @XmlEnumValue("CheckoutDateLessThanSystemDate")
    CHECKOUT_DATE_LESS_THAN_SYSTEM_DATE("CheckoutDateLessThanSystemDate"),
    @XmlEnumValue("KeyExpirationInFuture")
    KEY_EXPIRATION_IN_FUTURE("KeyExpirationInFuture"),
    @XmlEnumValue("KeyExpirationInPast")
    KEY_EXPIRATION_IN_PAST("KeyExpirationInPast"),
    @XmlEnumValue("MustProvidePassLevelNo")
    MUST_PROVIDE_PASS_LEVEL_NO("MustProvidePassLevelNo"),
    @XmlEnumValue("PassNumberIsInvalid")
    PASS_NUMBER_IS_INVALID("PassNumberIsInvalid"),
    @XmlEnumValue("UnableToCreateKeyNewSequenceRequired")
    UNABLE_TO_CREATE_KEY_NEW_SEQUENCE_REQUIRED("UnableToCreateKeyNewSequenceRequired"),
    @XmlEnumValue("UnableToProcessVerifyGuestKey")
    UNABLE_TO_PROCESS_VERIFY_GUEST_KEY("UnableToProcessVerifyGuestKey"),
    @XmlEnumValue("InternalPollingError")
    INTERNAL_POLLING_ERROR("InternalPollingError"),
    @XmlEnumValue("InternalOnlineError")
    INTERNAL_ONLINE_ERROR("InternalOnlineError"),
    @XmlEnumValue("InternalKeyDataFilesCorrupted")
    INTERNAL_KEY_DATA_FILES_CORRUPTED("InternalKeyDataFilesCorrupted"),
    @XmlEnumValue("InternalSystemResponseError")
    INTERNAL_SYSTEM_RESPONSE_ERROR("InternalSystemResponseError"),
    @XmlEnumValue("InternalSystemStartupBusy")
    INTERNAL_SYSTEM_STARTUP_BUSY("InternalSystemStartupBusy"),
    @XmlEnumValue("InternalSystemBusyClearing")
    INTERNAL_SYSTEM_BUSY_CLEARING("InternalSystemBusyClearing"),
    @XmlEnumValue("InternalSystemExecError")
    INTERNAL_SYSTEM_EXEC_ERROR("InternalSystemExecError"),
    @XmlEnumValue("InternalSystemErrorUnableToProcessRequests")
    INTERNAL_SYSTEM_ERROR_UNABLE_TO_PROCESS_REQUESTS("InternalSystemErrorUnableToProcessRequests"),
    @XmlEnumValue("InternalSystemErrorDriveAccessProblem")
    INTERNAL_SYSTEM_ERROR_DRIVE_ACCESS_PROBLEM("InternalSystemErrorDriveAccessProblem"),
    @XmlEnumValue("InternalSystemErrorTimeoutToProcessRequests")
    INTERNAL_SYSTEM_ERROR_TIMEOUT_TO_PROCESS_REQUESTS("InternalSystemErrorTimeoutToProcessRequests"),
    @XmlEnumValue("InternalSystemErrorFileDeletion")
    INTERNAL_SYSTEM_ERROR_FILE_DELETION("InternalSystemErrorFileDeletion"),
    @XmlEnumValue("InternalSystemErrorFileCorrupted")
    INTERNAL_SYSTEM_ERROR_FILE_CORRUPTED("InternalSystemErrorFileCorrupted"),
    @XmlEnumValue("InternalSystemErrorMemoryProblem")
    INTERNAL_SYSTEM_ERROR_MEMORY_PROBLEM("InternalSystemErrorMemoryProblem"),
    @XmlEnumValue("InternalSystemErrorClockProblem")
    INTERNAL_SYSTEM_ERROR_CLOCK_PROBLEM("InternalSystemErrorClockProblem"),
    @XmlEnumValue("InternalSystemErrorOverflowProblem")
    INTERNAL_SYSTEM_ERROR_OVERFLOW_PROBLEM("InternalSystemErrorOverflowProblem"),
    @XmlEnumValue("InternalSystemFilePointerProblem")
    INTERNAL_SYSTEM_FILE_POINTER_PROBLEM("InternalSystemFilePointerProblem"),
    @XmlEnumValue("InternalSystemOutOfDiskSpaceProblem")
    INTERNAL_SYSTEM_OUT_OF_DISK_SPACE_PROBLEM("InternalSystemOutOfDiskSpaceProblem"),
    @XmlEnumValue("InternalSystemFileWriteProblem")
    INTERNAL_SYSTEM_FILE_WRITE_PROBLEM("InternalSystemFileWriteProblem"),
    @XmlEnumValue("InternalSystemFileNotFoundProblem")
    INTERNAL_SYSTEM_FILE_NOT_FOUND_PROBLEM("InternalSystemFileNotFoundProblem"),
    @XmlEnumValue("InternalSystemFileNotReadableProblem")
    INTERNAL_SYSTEM_FILE_NOT_READABLE_PROBLEM("InternalSystemFileNotReadableProblem"),
    @XmlEnumValue("VIP_None")
    VIP_NONE("VIP_None"),
    @XmlEnumValue("VIP_Success")
    VIP_SUCCESS("VIP_Success"),
    VIP_CREATE_LOGFILE_FAILED("VIP_CREATE_LOGFILE_FAILED"),
    VIP_INVALID_COMMAND("VIP_INVALID_COMMAND"),
    VIP_INITIALIZATION_FAILED("VIP_INITIALIZATION_FAILED"),
    VIP_REQUEST_STATUS_FAILED("VIP_REQUEST_STATUS_FAILED"),
    VIP_WRITE_ERROR("VIP_WRITE_ERROR"),
    VIP_WRITE_TIMEOUT("VIP_WRITE_TIMEOUT"),
    VIP_READ_ERROR("VIP_READ_ERROR"),
    VIP_CARD_AUTH_FAILED("VIP_CARD_AUTH_FAILED"),
    VIP_READ_TIMEOUT("VIP_READ_TIMEOUT"),
    VIP_UNKNOWN_CARD_FORMAT("VIP_UNKNOWN_CARD_FORMAT"),
    VIP_INVALID_SECTOR("VIP_INVALID_SECTOR"),
    VIP_CARD_NOT_FORMATED("VIP_CARD_NOT_FORMATED"),
    VIP_ENCODER_FAILURE("VIP_ENCODER_FAILURE"),
    VIP_ENCODER_CONNECT_FAILED("VIP_ENCODER_CONNECT_FAILED"),
    VIP_ENCODER_DISCONNECT_FAILED("VIP_ENCODER_DISCONNECT_FAILED"),
    VIP_NOT_SAFLOK_PUBLISHER("VIP_NOT_SAFLOK_PUBLISHER"),
    VIP_NO_CARD_PRESENT("VIP_NO_CARD_PRESENT"),
    VIP_TOO_MUCH_CARDS("VIP_TOO_MUCH_CARDS"),
    VIP_NO_FREE_SECTORS("VIP_NO_FREE_SECTORS"),
    VIP_NO_TAGS_FOUND("VIP_NO_TAGS_FOUND"),
    @XmlEnumValue("VIP_RequestConfirmationToOverwriteKey")
    VIP_REQUEST_CONFIRMATION_TO_OVERWRITE_KEY("VIP_RequestConfirmationToOverwriteKey"),
    @XmlEnumValue("VIP_FatalErrorWithEViewer")
    VIP_FATAL_ERROR_WITH_E_VIEWER("VIP_FatalErrorWithEViewer"),
    @XmlEnumValue("VIP_DataNotFound")
    VIP_DATA_NOT_FOUND("VIP_DataNotFound"),
    @XmlEnumValue("VIP_EncoderBusy")
    VIP_ENCODER_BUSY("VIP_EncoderBusy"),
    @XmlEnumValue("VIP_Failed")
    VIP_FAILED("VIP_Failed"),
    @XmlEnumValue("IncorrectVIPNumberFormat")
    INCORRECT_VIP_NUMBER_FORMAT("IncorrectVIPNumberFormat"),
    @XmlEnumValue("VIPNumberFailedToBuild")
    VIP_NUMBER_FAILED_TO_BUILD("VIPNumberFailedToBuild"),
    @XmlEnumValue("VIPExceptionRaised")
    VIP_EXCEPTION_RAISED("VIPExceptionRaised"),
    @XmlEnumValue("VIP_EROR_KeyConfigData")
    VIP_EROR_KEY_CONFIG_DATA("VIP_EROR_KeyConfigData"),
    @XmlEnumValue("OperationNotSupported")
    OPERATION_NOT_SUPPORTED("OperationNotSupported"),
    @XmlEnumValue("KABALodgingInterfaceTranslationError")
    KABA_LODGING_INTERFACE_TRANSLATION_ERROR("KABALodgingInterfaceTranslationError"),
    @XmlEnumValue("KABALodgingInterfaceWSURLError")
    KABA_LODGING_INTERFACE_WSURL_ERROR("KABALodgingInterfaceWSURLError"),
    @XmlEnumValue("KABALodgingInterfaceCredentialError")
    KABA_LODGING_INTERFACE_CREDENTIAL_ERROR("KABALodgingInterfaceCredentialError"),
    @XmlEnumValue("KABALodgingInterfaceExceptionRaised")
    KABA_LODGING_INTERFACE_EXCEPTION_RAISED("KABALodgingInterfaceExceptionRaised"),
    @XmlEnumValue("ATLASExceptionRaised")
    ATLAS_EXCEPTION_RAISED("ATLASExceptionRaised"),
    @XmlEnumValue("ATLASIllegalCmdRcv")
    ATLAS_ILLEGAL_CMD_RCV("ATLASIllegalCmdRcv"),
    @XmlEnumValue("ATLASIllegalField")
    ATLAS_ILLEGAL_FIELD("ATLASIllegalField"),
    @XmlEnumValue("ATLASEncoderError")
    ATLAS_ENCODER_ERROR("ATLASEncoderError"),
    @XmlEnumValue("ATLASReaderError")
    ATLAS_READER_ERROR("ATLASReaderError"),
    @XmlEnumValue("ATLASInsufficientData")
    ATLAS_INSUFFICIENT_DATA("ATLASInsufficientData"),
    @XmlEnumValue("ATLASTooMuchData")
    ATLAS_TOO_MUCH_DATA("ATLASTooMuchData"),
    @XmlEnumValue("ATLASInvalidRoomNo")
    ATLAS_INVALID_ROOM_NO("ATLASInvalidRoomNo"),
    @XmlEnumValue("ATLASInvalidAuthorization")
    ATLAS_INVALID_AUTHORIZATION("ATLASInvalidAuthorization"),
    @XmlEnumValue("ATLASCardNotInserted")
    ATLAS_CARD_NOT_INSERTED("ATLASCardNotInserted"),
    @XmlEnumValue("ATLASCheckInOutOfRange")
    ATLAS_CHECK_IN_OUT_OF_RANGE("ATLASCheckInOutOfRange"),
    @XmlEnumValue("ATLASCheckInLargerCheckOut")
    ATLAS_CHECK_IN_LARGER_CHECK_OUT("ATLASCheckInLargerCheckOut"),
    @XmlEnumValue("ATLASCheckInSmallerCreation")
    ATLAS_CHECK_IN_SMALLER_CREATION("ATLASCheckInSmallerCreation"),
    @XmlEnumValue("ATLASNoInnerDoorsSelected")
    ATLAS_NO_INNER_DOORS_SELECTED("ATLASNoInnerDoorsSelected"),
    @XmlEnumValue("ATLASInvalidExpiry")
    ATLAS_INVALID_EXPIRY("ATLASInvalidExpiry"),
    @XmlEnumValue("ATLASNotGuestCard")
    ATLAS_NOT_GUEST_CARD("ATLASNotGuestCard"),
    @XmlEnumValue("ATLASFailed")
    ATLAS_FAILED("ATLASFailed"),
    @XmlEnumValue("ATLASHigherAuthorizarionNeeded")
    ATLAS_HIGHER_AUTHORIZARION_NEEDED("ATLASHigherAuthorizarionNeeded"),
    @XmlEnumValue("ATLASRoomNoOutOfRange")
    ATLAS_ROOM_NO_OUT_OF_RANGE("ATLASRoomNoOutOfRange"),
    @XmlEnumValue("ATLASDisabledFunction")
    ATLAS_DISABLED_FUNCTION("ATLASDisabledFunction"),
    @XmlEnumValue("ATLASInvalidDeviceAddress")
    ATLAS_INVALID_DEVICE_ADDRESS("ATLASInvalidDeviceAddress"),
    @XmlEnumValue("ATLASDeviceBusy")
    ATLAS_DEVICE_BUSY("ATLASDeviceBusy"),
    @XmlEnumValue("ATLASDeviceInactive")
    ATLAS_DEVICE_INACTIVE("ATLASDeviceInactive"),
    @XmlEnumValue("ATLASCommFailure")
    ATLAS_COMM_FAILURE("ATLASCommFailure"),
    @XmlEnumValue("ATLASDecodingError")
    ATLAS_DECODING_ERROR("ATLASDecodingError"),
    @XmlEnumValue("ATLASCardNotSupported")
    ATLAS_CARD_NOT_SUPPORTED("ATLASCardNotSupported"),
    @XmlEnumValue("ATLASInvalidCreation")
    ATLAS_INVALID_CREATION("ATLASInvalidCreation"),
    @XmlEnumValue("ATLASInvalidCheckIn")
    ATLAS_INVALID_CHECK_IN("ATLASInvalidCheckIn"),
    @XmlEnumValue("ATLASInvalidCoercivity")
    ATLAS_INVALID_COERCIVITY("ATLASInvalidCoercivity"),
    @XmlEnumValue("ATLASUnsupportedCoercivity")
    ATLAS_UNSUPPORTED_COERCIVITY("ATLASUnsupportedCoercivity"),
    @XmlEnumValue("KDSFail")
    KDS_FAIL("KDSFail");
    private final String value;

    EDetailEncoderFaultReasons(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EDetailEncoderFaultReasons fromValue(String v) {
        for (EDetailEncoderFaultReasons c: EDetailEncoderFaultReasons.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
