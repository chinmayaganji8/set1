package dataTypes;

import java.util.Scanner;

public class doubleNumber {

	static Scanner input = new Scanner(System.in);

	public static double DoubleInput() {
		double doubleNumber = 0;

		//System.out.print("Enter a doubleNumber :");
		boolean IsDouble = false;
		do {

			if (input.hasNextFloat()) {
				doubleNumber = input.nextDouble();
				IsDouble = true;
			} else {
				System.out.print("Enter a valid input (doubleNumber) : ");
				input.next();
			}
		} while (!IsDouble);
		return doubleNumber;

	}

}