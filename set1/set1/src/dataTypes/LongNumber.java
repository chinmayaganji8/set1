package dataTypes;

import java.util.Scanner;

public class LongNumber {

	// creating scanner object
	static Scanner input = new Scanner(System.in);

	// method to allow only LongNumber value
	public static long LongInput() {

		long LongNumber = 0;
//		System.out.print("Enter a LongNumber :");
		boolean IsLong = false;
		do {

			if (input.hasNextInt()) {          
				LongNumber = input.nextInt();
				IsLong = true;
			} else {
				System.out.print("Enter a valid input (LongNumber) : ");
				input.next();
			}
		} while (!IsLong);
		return LongNumber;

	}

}