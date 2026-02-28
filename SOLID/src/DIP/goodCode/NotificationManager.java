package DIP.goodCode;

public class NotificationManager {

	private MessageService msgService; // loose coupliing

	// Dependency injection
	public NotificationManager(MessageService messageService) {
		this.msgService = messageService;
	}

	public void notify(String message, String recipient) {
		msgService.sendMessage(message, recipient);
	}

}
