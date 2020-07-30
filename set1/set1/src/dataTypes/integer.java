package dataTypes;

import java.util.Scanner;

public class integer {

	// creating scanner object
	static Scanner input = new Scanner(System.in);

	// method to allow only integer value
	public static int integerInput() {

		int integer = 0;
//		System.out.print("Enter a integer :");
		boolean Isinteger = false;
		do {

			if (input.hasNextInt()) {          
				integer = input.nextInt();
				Isinteger = true;
			} else {
				System.out.print("Enter a valid input (Integer) : ");
				input.next();
			}
		} while (!Isinteger);
		return integer;

	}

}