package DIP.goodCode;

public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("SMS to " + receiver + ": " + message);
	}

}
