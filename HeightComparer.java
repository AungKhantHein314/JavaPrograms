import java.util.Scanner;

public class HeightComparer {
	void output(double p1, double p2) {
		if(p1 > p2) {
			System.out.println("Person One is Taller than Person Two"); 
		} else if(p1 < p2) {
			System.out.println("Person Two is Taller than Person One"); 
		} else {
			System.out.println("Two Persons are of same height");
		}
	}

	void getInput() {
		System.out.println("-----------------------------");
		System.out.println("HEIGHT COMPARE PROGRAM");
		System.out.println("-----------------------------");

		Scanner sc = new Scanner(System.in);

		System.out.print("Person One: ");
		double p1 = Double.parseDouble(sc.nextLine());

		System.out.print("Person Two: ");
		double p2 = Double.parseDouble(sc.nextLine());
		
		output(p1, p2);
	}

	public static void main(String[] args) {
		new HeightComparer().getInput();	
	}
}