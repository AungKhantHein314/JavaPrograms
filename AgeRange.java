public class AgeRange {
	Person[] people;
	int startAge;
	int endAge;
	
	AgeRange(int startAge, int endAge) {
		this.startAge = startAge;
		this.endAge = endAge;
	}

	public static void main(String[] args){
		AgeRange program = new AgeRange(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		program.addPersons(5);
		program.output();
	}

	void addPersons(int personsCount) {
		people = new Person[personsCount];
		people[0] = new Person("Hein Ko Ko", 23, "Yangon", "heinko@gmail.com");
		people[1] = new Person("Aung Htet Naing", 9, "Mandalay", "aunghtet@yahoo.com");
		people[2] = new Person("Mya Kyay Hmon", 34, "Bago", "myakyay@gmail.com");
		people[3] = new Person("Wutt Yee", 25, "Taung Gyi", "wuttyee@gmail.com");
		people[4] = new Person("Naing Min Oo", 45, "Kalaw", "naingmin@gmail.com");
	}

	void output() {
		System.out.println("\n---------------");
		System.out.println("Search Result");
		System.out.println("---------------");	
		generateResult();
		System.out.println("-----END-----");
	}

	void generateResult() {
		boolean found = false;
		int j = 1;
		for(int i = 0; i < this.people.length; i++){
			if(this.people[i].age >= this.startAge && this.people[i].age <= this.endAge){
				found = true;
				this.people[i].show(j);
				j++;
			}
		}
		System.out.print(found ? "" : "-----NOT FOUND!!!-----\n");
	}
}

class Person {
	String name;
	int age;
	String address;
	String email;

	Person(String name, int age, String address, String email) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}

	void show(int no){
		System.out.println("-----(" + no + ")-----");
		System.out.println("name=" + this.name);
		System.out.println("age=" + this.age);
		System.out.println("address=" + this.address);
		System.out.println("email=" + this.email);
	}
}