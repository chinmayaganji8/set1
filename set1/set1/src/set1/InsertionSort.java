package set1;

import dataTypes.integer;
import arrays.Array;

public class InsertionSort {

	public static void main(String args[]) {
		int size;
		InsertionSort ob = new InsertionSort();
		System.out.println("");

		System.out.println("====== InsertionSort ======");
		System.out.print("Enter the size of array : ");
		size = integer.integerInput();
		int arr[] = new int[size];
		
		Array.EnterElementsIntoTheArray(arr);

		ob.Insertionsort(arr);
		
		//printing array after sort
		Array.Print(arr);
	}

	// insertion sort program
	public void Insertionsort(int[] nums) {
		for (int index = 1; index < nums.length; index++) {
			int value = nums[index];
			int iterator = index - 1;
			while (iterator >= 0 && nums[iterator] > value) {
				nums[iterator + 1] = nums[iterator];
				iterator = iterator - 1;
			}
			nums[iterator + 1] = value;
		}
	}
}
