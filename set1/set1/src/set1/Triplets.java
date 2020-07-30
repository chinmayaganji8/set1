package set1;

import dataTypes.integer;

public class Triplets {
	public static void main(String[] args) {

		System.out.println("===== TRIPLETS PROGRAM =====");
		System.out.print("Enter the size of the set : ");
		int size = integer.integerInput();
		int[] inputArray = new int[size];
		System.out.println("Enter the elemets of the set : ");
		for (int index = 0; index < size; index++) {
			inputArray[index] = integer.integerInput();

		}

		BubbleSort(inputArray);

		System.out.println("============= TRIPLETS ==============");
		System.out.println(Triplet(inputArray));

	}

	// method to return Triplet
	public static String Triplet(int[] inputArray) {
		String triplet = "";
		int size = inputArray.length;
		for (int index = 0; index < size - 1; index++) {
			for (int iterator = index + 1; iterator < size; iterator++) {
				int sum = inputArray[index] + inputArray[iterator];

				if (inputArray[index] != inputArray[iterator]) {
					for (int k = iterator + 1; k < size; k++) {
						if (sum == inputArray[k]) {

							triplet += "< " + inputArray[index] + " ," + inputArray[iterator] + " ," + inputArray[k]
									+ " >\n";
							break;
						}
					}
				}
			}
		}
		return triplet;
	}

	// bubble sort method
	public static void BubbleSort(int[] inputArray) {
		int size = inputArray.length;
		for (int outerLoop = 0; outerLoop < size - 1; outerLoop++) {
			for (int innerLoop = 0; innerLoop < size - outerLoop - 1; innerLoop++) {
				if (inputArray[innerLoop] > inputArray[innerLoop + 1]) {
					int temp = inputArray[innerLoop];
					inputArray[innerLoop] = inputArray[innerLoop + 1];
					inputArray[innerLoop + 1] = temp;

				}
			}
		}
	}
}
