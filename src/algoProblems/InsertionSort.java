package algoProblems;

public class InsertionSort {

	/**Variables:-
	 * ===========
	 * @param arr -> given array
	 * @param n -> length of array as the last index of array
	 *
	 * ===========
	 **Procedure:-
	 *============
	 *1. Function to sort array using insertion sort
	 *2. function to print array of size n
	 *3. Driver Method to test above by passing the required parameters
	 */
	 /*1. Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
    /*2. function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }

	//3. Driver Method to test above by passing the required parameters
	/**
	 * @param args arr -> Define the values of Array
	 */
	public static void main(String[] args) {
		int arr[] = { 21, 12, 23, 15, 6 };
		 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
	}

}
