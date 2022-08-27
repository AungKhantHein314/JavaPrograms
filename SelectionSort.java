public class SelectionSort { 
	int arrayLength = 5;

	// Check whether user inputs are in expected forms or not
	int[] makeArr(String[] args){
		int[] numbers = new int[this.arrayLength];
		if(args.length >= this.arrayLength) {
			try {
				for(int i = 0; i < numbers.length; i++){
					numbers[i] = Integer.parseInt(args[i]);
				}
			} catch (Exception e) {
				System.out.println("Plese input only numbers.");
				System.exit(0);
			}
		} else {
			System.out.println("Please input " + this.arrayLength + " numbers.");
			System.exit(0);
		}		
		return numbers;	
	}

	// If in expected form, then do selection sort
	int[] sort(int[] numbers) {
		int n = numbers.length;
		for(int i = 0; i < n - 1; i++) {
			int smallestIndex = i;
			for(int j = i; j < n; j++) {
				if(numbers[j] < numbers[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[smallestIndex];
			numbers[smallestIndex] = temp;
		}	
		return numbers;	
	}

	// After selection sort, output the result
	void output(String[] args, int[] numbers) {
		String originalArray = "Original Array:";
		String sortedArray = "Sorted Array:  ";
		for(int i = 0; i < this.arrayLength; i++){
			originalArray += (" " + args[i]);
			sortedArray += (" " + numbers[i]);
		}
		System.out.println(originalArray);
		System.out.println(sortedArray);
	}

	public static void main(String [] args) {
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.output(args, selectionSort.sort(selectionSort.makeArr(args)));		
	}
}