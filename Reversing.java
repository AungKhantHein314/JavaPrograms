public class Reversing {
	public static void main(String[] args) {
		Reversing reversing = new Reversing();
		reversing.checkWords(args[0]);
	}

	void checkWords(String words) {
		if(words.length() > 7){
			System.out.println("ERROR: Your Characters is over 7!");
		} else {
			reverse(words);
		}
	}

	void reverse(String words) {
		String result = "";
		for(int i = words.length() - 1; i >= 0; i--){
			result += words.charAt(i);	
		}
		System.out.println("Your Words: " + words);
		System.out.println("Reversed Words: " + result);
	}
}