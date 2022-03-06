package algoProblems;

public class BinarySearch {

	/**Variables Declared:-
	 * =====================
	 * @param arr -> Given Array
	 * @param l -> Starting index of Array
	 * @param r -> Ending index of Array
	 * @param x -> Value to search in Array
	 * @return -> If element is present in array will return index of value else return -1
	 * 
	 * ================
	 ** Procedure :-
	 * ================
	 * 1. Created a method to find the index of value present in an Array using binary search method
	 * 2. Driver Method to test above by passing the required parameters 
	 */
	
	
	//1. Created a method to find the index of value present in an Array using binary search method
	int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x) {
				return mid;
			}
			
			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			}
			
			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	//2. Driver Method to test above by passing the required parameters
	/**
	 * @param args arr -> Define the values of Array
	 * @param n -> length of an Array passing as last index of given Array
	 * @param x -> value to search in Array
	 */
	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 40;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
