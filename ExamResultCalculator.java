public class ExamResultCalculator {
	public static void main(String [] args) {
		String arg = args[0];
		try {
			double marks = Double.parseDouble(arg);
			String output = marks > 100 
				? "Please Enter Valid Marks!"
				: marks > 79
					? "Congraz... Exam Passed with Destination"
					: marks > 39
						? "Exam Passed"
						: marks < 0
							? "You must be kidding. Enter Valid Marks"
							: "Oh No! Please be careful in Next Time";
	
			System.out.println(output);
		}
		catch(Exception e) {
			System.out.println("Please Enter Your Marks (Numbers Only) between 0 and 100 inclusively");
		}
	}
}