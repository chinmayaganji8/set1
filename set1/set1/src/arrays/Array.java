package arrays;

import dataTypes.*;

public class Array {

	public static int[] EnterElementsIntoTheArray(int[] array) {
		System.out.println("Enter the elemnts in to the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = integer.integerInput();
		}
		return array;
	}

	
	public static double[] EnterElementsIntoTheArray(double[] array) {
		System.out.println("Enter the elemnts in to the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = doubleNumber.DoubleInput();
		}
		return array;
	}
	
	
	public static int[] Sort(int[] inputArray) {
		int size = inputArray.length;
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

	public static int Sum(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];

		}
		return sum;
	}

	public static void Print(int[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

	
	
	public static void Print(double[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
	
	
	public static void ArrayToLowercase(char[] inputArray) {
		int size = inputArray.length;
		for (int index = 0; index < size; index++) {
			inputArray[index] = ToLowercase(inputArray[index]);

		}
	}

	public static char ToLowercase(char character) {
		int ascii = 0;
		ascii = (int) character;
		if ((ascii >= 65) && (ascii <= 90)) {
			ascii += 32;
			character = (char) ascii;
			return character;
		}
		return character;

	}

	public static char ToUppercase(char character) {
		int ascii = 0;
		ascii = (int) character;
		if ((ascii >= 97) && (ascii <= 122)) {
			ascii -= 32;
			character = (char) ascii;
			return character;
		}
		return character;

	}

}