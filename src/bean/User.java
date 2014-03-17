package bean;

public class User {
	String user;
	String password;
	String email;
	String phone;
	String qq;
	public User() {
		super();
	}
	public User(String user, String password, String email, String phone,
			String qq) {
		super();
		this.user = user;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.qq = qq;
	}
	
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getQq() {
		return qq;
	}
	
	
}
