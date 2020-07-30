package set1;

import arrays.Array;
import dataTypes.integer;

public class SumofArrayElements {
	static int size1, size2;

	public static void main(String[] args) {
        System.out.println("===================== Addition Of Double Arrays Program =========================S");
		System.out.println("Enter the size of first array : ");
		size1 = integer.integerInput();
		double arr[] = new double[size1];

		// System.out.println("Enter the elements of the first array : ");
		Array.EnterElementsIntoTheArray(arr);

		System.out.println("Enter the size of second array : ");
		size2 = integer.integerInput();
		double arr2[] = new double[size2];

		// System.out.println("Enter the elements of the second array : ");
		Array.EnterElementsIntoTheArray(arr2);

		// printing after addition
		System.out.println("The sum of two Arrays is : ");
		if (size1 >= size2) {
			for (int index = 0; index < size1; index++)
				System.out.printf("  %.2f ", arr[index]);
		} else {
			for (int index = 0; index < size2; index++)
				System.out.printf("  %.2f ", arr2[index]);
		}

	}

	public static void AdditionOfArrays(double[] arr, double[] arr2) {
		// adding arrays
		if (size1 >= size2) {
			for (int index = 0; index < size2; index++) {
				arr[index] += arr2[index];
			}

		} else {
			for (int index = 0; index < size1; index++) {
				arr2[index] += arr[index];
			}

		}

	}
}
