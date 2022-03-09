package algoProblems;

public class InsertionSorting1<T extends Comparable<T>> {
	
	
	public <T extends Comparable<T>>void sort(String arr[], int size)
    {
        for (int i = 1; i < size; ++i) {
            T key = (T) arr[i];
            int j = i-1;
            int look = key.compareTo((T) arr[j]);
 
            while (j >= 0 && look < 0) {
            	look = key.compareTo((T) arr[j]);
            	String temp = arr[j+1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j = j - 1;
            }
            arr[j + 1] = (String) key;
        }
        printArray(arr,size);
    }
 
    /*2. function to print array of size n*/
    static void printArray(String arr[],int size)
    {
    	System.out.println("--------Insertion Sorting---------");
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }

}
