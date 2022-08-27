class RockPaperScissor {
	public static void main (String [] args) {

	// String p1 = args[0];
	// String p2 = args[1];

	String input1 = args[0];
	String input2 = args[1];

	// String one = "Player One win!";
	// String two = "Player Two win!";
	// String wgInput = "Wrong Input!!!";

	String result;

	// String result = p1.equals(p2)
	// 	? "It's DRAW"
	// 	: "r".equals(p1)
	// 		? "s".equals(p2)
	// 			? one
	// 			: "p".equals(p2)
	// 				? two
	// 				: wgInput
	// 		: "s".equals(p1)
	// 			? "r".equals(p2)
	// 				? two
	// 				: "p".equals(p2)
	// 					? one
	// 					: wgInput
	// 			: "p".equals(p1)
	// 				? "r".equals(p2)
	// 					? one
	// 					: "s".equals(p2)
	// 						? two
	// 						: wgInput
	// 				: wgInput;

	if(input1.equals(input2)) {
		result = "It's Draw";
	} else if ("r".equals(input1)) {
		if ("p".equals(input2)) {
			result = "Player Two win!";
		} else if ("s".equals(input2)) {
			result = "Player One win!";
		} else {
			result = "Wrong Input!!!";
		}
	} else if ("p".equals(input1)) {
		if ("r".equals(input2)) {
			result = "Player One win!";
		} else if ("s".equals(input2)) {
			result = "Player Two win!";
		} else {
			result = "Wrong Input!!!";
		}
	} else if ("s".equals(input1)) {
		if ("r".equals(input2)) {
			result = "Player Two win!";
		} else if ("p".equals(input2)) {
			result = "Player One win!";
		} else {
			result = "Wrong Input!!!";
		}
	} else {
		result = "Wrong Input!!!";
	}
	System.out.println(result);
	}		
}