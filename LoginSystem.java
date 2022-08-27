public class LoginSystem {
	private String userName;
	private String userPassword;
	LoginSystem(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
		output(this.userName, this.userPassword);
	}
	
	public static void main(String [] args) {
		LoginSystem ls = new LoginSystem(args[0], args[1]);	
	}

	void output(String userName, String userPassword) {
		boolean n = checkName(userName);
		boolean p = checkPassword(userPassword);
		if(n && p) {
			System.out.println("Login Successful.");
		} else {
			System.out.println("Login Failed.");
		}	
	}

	boolean checkName(String userName) {
		switch(userName) {
			case "admin": return true;
			default: return false;
		}
	}

	boolean checkPassword(String userPassword) {
		switch(userPassword) {
			case "password": return true;
			default: return false;
		}
	}
}