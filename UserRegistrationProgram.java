class UserRegistration {
	String name;
    	int age;
    	String gender;
    	String phoneNumber;
    	String address;

	public static void main(String [] args) {
		UserRegistration user = new UserRegistration(args[0], Integer.parseInt(args[1]), args[2], args[3], args[4]);
        	user.output();
		UserRegistration user1 = new UserRegistration();
	}

    	UserRegistration(String name, int age, String gender, String phoneNumber, String address){
        	this.name = name;
        	this.age = age;
        	this.gender = gender;
        	this.phoneNumber = phoneNumber;
        	this.address = address;
		System.out.println("Hello2");
    	}

	UserRegistration() {
		System.out.println("Hello");
	}

    	void output() {
        	System.out.println("Name: " + name);
        	System.out.println("Age: " + age);
        	System.out.println("Gender: " + gender);
        	System.out.println("Phone Number: " + phoneNumber);
        	System.out.println("Address: " + address);
        	System.out.println("++++++++++++++");
        	System.out.println("Your information was registered.");
        	System.out.println("++++++++++++++");
    	}
}