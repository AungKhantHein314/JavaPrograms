public class RockPaperScissor2 {
	public static void main(String[] args) {
		String input1 = args[0];
		String input2 = args[1];
		String result;

		String one = "Player One win!";
		String two = "Player Two win!";
		String wgIput = "Wrong Input!!!";

		if (input1.equals(input2) && ("p".equals(input1) || "r".equals(input1) || "s".equals(input1))) {
			result = "It's Draw";
		} else if ("r".equals(input1)) {
			if ("p".equals(input2)) {
				result = two;
			} else if ("s".equals(input2)) {
				result = one;
			} else {
				result = wgIput;
			}
		} else if ("p".equals(input1)) {
			if ("r".equals(input2)) {
				result = one;
			} else if ("s".equals(input2)) {
				result = two;
			} else {
				result = wgIput;
			}
		} else if ("s".equals(input1)) {
			if ("r".equals(input2)) {
				result = two;
			} else if ("p".equals(input2)) {
				result = one;
			} else {
				result = wgIput;
			}
		} else {
			result = wgIput;
		}
		System.out.println(result);
	}
}