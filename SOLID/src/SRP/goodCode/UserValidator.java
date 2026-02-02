package SRP.goodCode;

public class UserValidator {
	public boolean isValidEmail(String email) {
		// Validation logic only
		return email != null && email.contains("@");
	}
}