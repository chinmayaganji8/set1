package set1;

import dataTypes.integer;

public class Reverse {

	public static void main(String[] args) {

		System.out.println("===== REVERSE OF A NUMBER PROGRAM =====");
		System.out.print("Enter the Number : ");
		int number = integer.integerInput();

		System.out.println(reverse(number));
	

	}

	// reverse method
	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {

			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}
		return reverse;
	}

}
