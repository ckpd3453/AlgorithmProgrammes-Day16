package algoProblems;

public class BubbleSort {

	/**Variables:-
	 * ===========
	 * @param arr -> given array
	 * @param n -> length of array as the last index of array
	 *
	 * ===========
	 **Procedure:-
	 *============
	 *1. Function to sort array using bubble sort
	 *2. function to print array of size n
	 *3. Driver Method to test above by passing the required parameters
	 */
	
	//1. Function to sort array using bubble sort
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	//2. function to print array of size n
	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	//3. Driver Method to test above by passing the required parameters

	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 46, 63, 22, 15, 32, 10, 70 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
