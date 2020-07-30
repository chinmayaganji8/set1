package set1;

import dataTypes.*;
import arrays.*;

public class BubbleSort {
	static int size;

	public static void main(String[] args) {
		// creating object
		BubbleSort obj = new BubbleSort();
		System.out.print("Enter the size of the array : ");
		size = integer.integerInput();
		int inputArray[] = new int[size];

		// Reading elements into the Array
		Array.EnterElementsIntoTheArray(inputArray);

		// Calling bubbleSort Method
		inputArray = obj.bubbleSort(inputArray);

		// printing Elements after sorting
		System.out.println("============== Elements After Sorting ==============");
		Array.Print(inputArray);

	}

	// bubbleSort method

	public int[] bubbleSort(int[] inputArray) {

		for (int outerLoop = 0; outerLoop < size - 1; outerLoop++) {
			for (int innerLoop = 0; innerLoop < size - outerLoop - 1; innerLoop++) {
				if (inputArray[innerLoop] > inputArray[innerLoop + 1]) { // comparing adjacent elements

					// swapping
					int temp = inputArray[innerLoop];
					inputArray[innerLoop] = inputArray[innerLoop + 1];
					inputArray[innerLoop + 1] = temp;
				}

			}
		}
		return inputArray;
	}
}
