package SRP.goodCode;

//Each class has single responsibility
public class User {

	private String name;
	private String email;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Getters and setters only
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}