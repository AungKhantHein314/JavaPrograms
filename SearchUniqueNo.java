class SearchUniqueNo {
	String nonUnique;
	
	public static void main(String[] args){
		SearchUniqueNo sun = new SearchUniqueNo();
		sun.checkIfNums(args);
		sun.setNonUnique(args);
		sun.searchUnique(args);
	}

	void setNonUnique(String[] args) {
		if(args[0].equals(args[1])) {
			this.nonUnique = args[0];
		} else {
			this.nonUnique = args[2];
		}
	}

	void searchUnique(String[] args) {
		boolean flag = false;
		for(int i = 0; i < 5; i++) {
			if(!this.nonUnique.equals(args[i])) {
				flag = true;
				System.out.println("Index: " + (i + 1));
				System.out.println("Unique Number: " + args[i]);
			} 
		}
		System.out.print(flag ? "" : "No Unique Number!\n");
	}

	void checkIfNums(String[] args) {
		double j = 0;
		try {
			for(int i = 0; i < 5; i++){
				j = Double.parseDouble(args[i]);
			}
		} catch (Exception e) {
			System.out.println("Please input 5 numbers");
			System.exit(0);
		}
	}
}