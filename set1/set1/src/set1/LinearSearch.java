package set1;

import dataTypes.integer;
import arrays.Array;

public class LinearSearch {

	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		System.out.println("============ LINEAR SEARCH PROGRAM =============");
		System.out.print("Enter the size of the array : ");
		int size = integer.integerInput();
		int arr[] = new int[size];

		// Entering elements into the array
		Array.EnterElementsIntoTheArray(arr);

		System.out.println("Enter the element you want to search : ");
		int searchNumber = integer.integerInput();

		boolean IsFound = obj.linearSearch(arr, searchNumber);
		if (IsFound) {
			System.out.println("The Number " + searchNumber + " is Found......!");
		}
		else
			System.out.println("The Number " + searchNumber + " is Not Found......!");

	}

	// method for Linear Search
	boolean linearSearch(int[] arr, int searchNumber) {
		int size = arr.length;

		for (int index = 0; index < size; index++) {

			if (arr[index] == searchNumber) {
				return true;
			}

		}

		return false;

	}

}
