package SRP.badCode;

//Violates SRP - too many responsibilities
public class User {

	private String name;
	private String email;

	// User data management
	public void setName(String name) {
		this.name = name;
	}

	// Database operations
	public void saveToDatabase() {
		// DB logic
	}

	// Email operations
	public void sendEmail(String message) {
		// Email logic
	}

	// Validation
	public boolean validateEmail() {
		// Validation logic
		return true;
	}

	// Logging
	public void logUserActivity() {
		// Logging logic
	}
}