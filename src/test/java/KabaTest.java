import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.noetic.kaba.AddGuestAccessResponse.AddGuestAccessResult;
import uk.co.noetic.kaba.ArrayOfCCommonAreas;
import uk.co.noetic.kaba.ArrayOfString;
import uk.co.noetic.kaba.CMessengerResponse;
import uk.co.noetic.kaba.CancelGuestsAccessToRoomResponse.CancelGuestsAccessToRoomResult;
import uk.co.noetic.kaba.CancelGuestsMobileAccessToRoomResponse.CancelGuestsMobileAccessToRoomResult;
import uk.co.noetic.kaba.CheckOutGuestResponse;
import uk.co.noetic.kaba.CheckOutGuestResponse.CheckOutGuestResult;
import uk.co.noetic.kaba.CreateNewBooking;
import uk.co.noetic.kaba.CreateNewBookingResponse;
import uk.co.noetic.kaba.CreateNewBookingResponse.CreateNewBookingResult;
import uk.co.noetic.kaba.DenyAccessToGuestResponse.DenyAccessToGuestResult;
import uk.co.noetic.kaba.Fault;
import uk.co.noetic.kaba.MakeDuplicateKeyResponse.MakeDuplicateKeyResult;
import uk.co.noetic.kaba.MessengerPMSWSService;
import uk.co.noetic.kaba.ObjectFactory;
import uk.co.noetic.legic.LegicCustomService;
import uk.co.noetic.legic.PrepareDirectWalletRegistrationRequest;
import uk.co.noetic.legic.PrepareDirectWalletRegistrationResponse;
import uk.co.noetic.util.KabaConfigEnum;
import uk.co.noetic.util.KabaConfigUtils;
import uk.co.noetic.util.KabaUtil;

/**
 * @author Sampath Ekanayake created on Oct 18, 2017
 *
 */
public class KabaTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(KabaTest.class);
	private static String targetEnv = "DEV";

	static MessengerPMSWSService service = new MessengerPMSWSService(targetEnv);
	static final String reservationID = "1234";
	static final String siteName = "MAIN";
	static final String pmsTerminalID = "1";

	public static void main(String[] args) {

		BasicConfigurator.configure();
		KabaTest kt = new KabaTest();

		// kt.prepareLEGICRgistration();
		// kt.makeDuplicaKey();
		 kt.createNewKey();
	}

	private void prepareLEGICRgistration() {

		String leadGuestName = "Sam LgTest";
		String mobileNumber = "9483768768";

		String WALLET_ID = KabaConfigUtils.getPropValue(KabaConfigEnum.LEGIC_WALLET_ID, "legic", targetEnv);
		String customNumber = KabaUtil.generateCustomNum(WALLET_ID, mobileNumber);

		try {
			PrepareDirectWalletRegistrationRequest walletRegRequest = new PrepareDirectWalletRegistrationRequest();
			walletRegRequest.setWalletId(WALLET_ID);
			walletRegRequest.setPublicSEId(customNumber);

			LegicCustomService legicService = new LegicCustomService(targetEnv);
			PrepareDirectWalletRegistrationResponse walletRegistrationResponse = legicService
					.prepareLEGICRgistration(walletRegRequest);

			LOGGER.info("Legic Token: " + walletRegistrationResponse.getToken());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void createNewKey() {

		String reservationID = "1236";
		String encoderID = "999Tcustom#46773385-HuwY5";
		String siteName = "MOBILE";
		String pmsTerminalID = "1";
		long keyCount = 1;
		long keySize = 0;
		String uid = null;
		String guestName = "Sam JTest";

		reservationID = "1239";

		boolean bGrantAccessPredefinedSuiteDoors = Boolean.FALSE;
		ArrayOfString variableRoomList = new ArrayOfString();
		ArrayOfCCommonAreas commonAreaList = new ArrayOfCCommonAreas();
		XMLGregorianCalendar checkIn = null;
		XMLGregorianCalendar checkOut = null;
		;
		try {
			checkIn = KabaUtil.getXMLGregorianCalendar("2018-09-27T01:01:01");
			checkOut = KabaUtil.getXMLGregorianCalendar("2018-09-28T01:01:01");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String mainRoomNo = "201";

		String trackIIFolioNo = null;
		String trackIGuestNo = null;

		try {

			/*
			 * CreateNewBookingResult createNewBookingResult =
			 * service.getMessengerPMSWSServiceSoap().createNewBooking(reservationID,
			 * siteName, pmsTerminalID, encoderID, checkIn, checkOut, guestName, mainRoomNo,
			 * bGrantAccessPredefinedSuiteDoors, variableRoomList, commonAreaList,
			 * trackIIFolioNo, trackIGuestNo, keyCount, keySize, uid);
			 */

			CreateNewBooking createNewBooking = new ObjectFactory().createCreateNewBooking();
			createNewBooking.setReservationID(reservationID);
			createNewBooking.setSiteName(siteName);
			createNewBooking.setPMSTerminalID(pmsTerminalID);
			createNewBooking.setEncoderID(encoderID);
			createNewBooking.setCheckIn(checkIn);
			createNewBooking.setCheckOut(checkOut);
			createNewBooking.setGuestName(guestName);
			createNewBooking.setMainRoomNo(mainRoomNo);
			createNewBooking.setBGrantAccessPredefinedSuiteDoors(bGrantAccessPredefinedSuiteDoors);
			createNewBooking.setVariableRoomList(variableRoomList);
			createNewBooking.setCommonAreaList(commonAreaList);
			createNewBooking.setTrackIIFolioNo(trackIIFolioNo);
			createNewBooking.setTrackIGuestNo(trackIGuestNo);
			createNewBooking.setKeyCount(keyCount);
			createNewBooking.setKeySize(keySize);
			createNewBooking.setUID(uid);

            CreateNewBookingResponse createNewBookingResponse = service
                    .getMessengerPMSWSServiceSoap(KabaConfigUtils.getPropValue(KabaConfigEnum.WS_ENDPOINT, "kaba", targetEnv),
                            KabaConfigUtils.getPropValue(KabaConfigEnum.USER_NAME, "kaba", targetEnv),
                            KabaConfigUtils.getPropValue(KabaConfigEnum.PASSWORD, "kaba", targetEnv))
                    .createNewBooking(createNewBooking);
			CreateNewBookingResult createNewBookingResult = createNewBookingResponse.getCreateNewBookingResult();

			Fault fault = (Fault) KabaUtil.getJavaObj(createNewBookingResult.getContent().get(0), Fault.class);

			if (fault.getFaultcode() == null) {
				CMessengerResponse msgResponse = (CMessengerResponse) KabaUtil
						.getJavaObj(createNewBookingResult.getContent().get(0), CMessengerResponse.class);
				System.out.println("Create NewKey Response-->>" + msgResponse.getResponseMessage());
			} else {
				System.out.println("Create NewKey Response-->>" + fault.getDetailInfo());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void makeDuplicaKey() {
		// String reservationID = "1234";
		// String siteName = "MAIN";
		// String pmsTerminalID = "1";
		String encoderID = "999Tcustom#46773385-HY7";
		long keyCount = 1;
		long keySize = 0;
		String uid = null;
		String guestName = "Sam JTest";

		MakeDuplicateKeyResult duplicateKeyResult = service.getMessengerPMSWSServiceSoap()
				.makeDuplicateKey(reservationID, siteName, pmsTerminalID, encoderID, keyCount, keySize, uid, guestName);

		try {
			CMessengerResponse msgResponse = new CMessengerResponse();

			msgResponse = (CMessengerResponse) KabaUtil.getJavaObj(duplicateKeyResult.getContent().get(0),
					CMessengerResponse.class);

			Fault fault = (Fault) KabaUtil.getJavaObj(duplicateKeyResult.getContent().get(0), Fault.class);

			if (fault.getFaultcode() == null) {
				msgResponse = (CMessengerResponse) KabaUtil.getJavaObj(duplicateKeyResult.getContent().get(0),
						CMessengerResponse.class);
				System.out.println("MakeDuplicateKey Response-->>" + msgResponse.getResponseMessage());
			} else {
				System.out.println("MakeDuplicateKey Response-->>" + fault.getDetailInfo());
			}

			System.out.println("--------------");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void addGuestAccess() {

		ArrayOfString roomList = new ArrayOfString();
		// roomList.getString().add("200");
		roomList.getString().add("201");

		AddGuestAccessResult addGuestAccessResult = service.getMessengerPMSWSServiceSoap().addGuestAccess(reservationID,
				siteName, pmsTerminalID, roomList);

		try {
			CMessengerResponse response = new CMessengerResponse();
			response = (CMessengerResponse) KabaUtil.getJavaObj(addGuestAccessResult.getContent().get(0),
					CMessengerResponse.class);
			System.out.println("-->>" + response.getResponseMessage());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void denyAccessToGuest() {

		DenyAccessToGuestResult denyAccessToGuestResult = service.getMessengerPMSWSServiceSoap()
				.denyAccessToGuest(reservationID, siteName, pmsTerminalID);

		try {
			CMessengerResponse response = new CMessengerResponse();
			response = (CMessengerResponse) KabaUtil.getJavaObj(denyAccessToGuestResult.getContent().get(0),
					CMessengerResponse.class);
			System.out.println("-->>" + response.getResponseMessage());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void cancelGuestsAccessToRoom() {

		String mainRoomNumber = "202";
		CancelGuestsAccessToRoomResult cancelGuestsAccessToRoomResult = service.getMessengerPMSWSServiceSoap()
				.cancelGuestsAccessToRoom(siteName, mainRoomNumber, pmsTerminalID);

		try {
			CMessengerResponse response = new CMessengerResponse();
			response = (CMessengerResponse) KabaUtil.getJavaObj(cancelGuestsAccessToRoomResult.getContent().get(0),
					CMessengerResponse.class);
			System.out.println("-->>" + response.getResponseMessage());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void cancelGuestsMobileAccessToRoom() {

		String mainRoomNumber = "201";
		String guestMobileNumber = "+940716961184";

		CancelGuestsMobileAccessToRoomResult cancelGuestsMobileAccessToRoomResult = service
				.getMessengerPMSWSServiceSoap().cancelGuestsMobileAccessToRoom(siteName, reservationID, mainRoomNumber,
						guestMobileNumber, pmsTerminalID);

		try {
			CMessengerResponse response = new CMessengerResponse();
			response = (CMessengerResponse) KabaUtil
					.getJavaObj(cancelGuestsMobileAccessToRoomResult.getContent().get(0), CMessengerResponse.class);
			System.out.println("-->>" + response.getResponseMessage());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void checkOutGuest() {

		CheckOutGuestResult checkOutGuestResult = service.getMessengerPMSWSServiceSoap().checkOutGuest(reservationID,
				siteName, pmsTerminalID);
		try {
			CMessengerResponse response = new CMessengerResponse();
			response = (CMessengerResponse) KabaUtil.getJavaObj(checkOutGuestResult.getContent().get(0),
					CMessengerResponse.class);
			System.out.println("-->>" + response.getResponseMessage());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
