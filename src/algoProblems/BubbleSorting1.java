package algoProblems;

public class BubbleSorting1<T extends Comparable<T>> {
	public <T extends Comparable<T>>void Sort(String arr[], int size) {
		
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				int look = arr[j+1].compareTo((String) arr[j]);
				if (look < 0) {
					// swap arr[j+1] and arr[j]
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printArray(arr, size);
	}

	//2. function to print array of size n
	/* Prints the array */
	void printArray(String arr[], int size) {
		
		System.out.println("--------Bubble Sorting---------");
		for (int j = 0; j < size; ++j)
			System.out.print(arr[j] + " ");
		System.out.println();
	}
}
