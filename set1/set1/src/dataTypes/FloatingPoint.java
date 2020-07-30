package dataTypes;

import java.util.Scanner;

public class FloatingPoint {
	
	// creating Scanner object
	static Scanner input = new Scanner(System.in);

	public static float floatInput() {
		float Float = 0.0f;

//		System.out.print("Enter a Float : ");
		boolean IsFloat = false;
		do {

			if (input.hasNextFloat()) {
				Float = input.nextFloat();
				IsFloat = true;
			} else {
				System.out.print("Enter a valid input (Float variable) : ");
				input.next();
			}
		} while (!IsFloat);
		return Float;

	}

}