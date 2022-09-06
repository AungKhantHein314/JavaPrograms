import java.util.Scanner;

class Person {
	private String name;
	private String salary;
	private String role;

	Person(String name, String salary, String role) {
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	void display(int id) {
		System.out.printf("%-8s%-25s%-10s%-10s", (id + 1), this.name, this.salary, this.role);
	}
}

public class DataEntry {
	int i;
	Person[] people = new Person[5];

	public static void main(String[] args) {
		DataEntry dataEntry = new DataEntry();
		dataEntry.doDataEntry();
	}

	// Check if there is still place for new person and then, if user will input
	// data
	void doDataEntry() {
		Scanner scanner = new Scanner(System.in);
		if (i < 5) {
			System.out.print("\nData Entry? (Y/n) ... ");
			String willEntry = scanner.nextLine();
			if ("y".equalsIgnoreCase(willEntry)) {
				getInput(scanner);
			} else if ("n".equalsIgnoreCase(willEntry)) {
				doResult();
			} else {
				doDataEntry();
			}
		} else {
			scanner.close();
			doResult();
		}
	}

	// If user choose to input data, this functions get inputs from user
	void getInput(Scanner scanner) {
		// Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Salary: ");
		String salary = scanner.nextLine();
		System.out.print("Role: ");
		String role = scanner.nextLine();
		addNewPerson(name, salary, role);
	}

	// this function add user with infromation from input data
	void addNewPerson(String name, String salary, String role) {
		people[i] = new Person(name, salary, role);
		i++;
		doDataEntry();
	}

	// after data entry is done, display result
	void doResult() {
		if (i > 0) {
			System.out.println("\n----Result----");
			System.out.printf("%-8s%-25s%-10s%-10s", "id", "name", "salary", "role");
			for (int j = 0; j < i; j++) {
				people[j].display(j);
			}
			System.out.println("\n----End----");
		} else {
			System.out.println("No Input");
		}
	}
}

