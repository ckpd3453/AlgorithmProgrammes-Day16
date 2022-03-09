package algoProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	

	 
		//3. Driver Method to test above by passing the required parameters
		/**
		 * @param <T>
		 * @param args arr -> Define the values of Array
		 */
		public static <T> void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of inputs you want:- ");
			int n = scan.nextInt();
			/* DataForSorting size = new DataForSorting(null, n); */
			String arr[] = new String[n];
			int i;
			for (i=0; i<n; i++)
			{
				System.out.println("Enter the values:-");
				T val = (T) scan.next();
				arr[i]=(String) val;
			}
			/*
			 * for (i=0;i<n;i++) { System.out.print(arr[i]+" "); }
			 */
			InsertionSorting1 obj1 = new InsertionSorting1();
			obj1.sort(arr,n);
			 BubbleSorting1 obj2 = new BubbleSorting1(); 
			 obj2.Sort(arr, n);
			 
		}
}
