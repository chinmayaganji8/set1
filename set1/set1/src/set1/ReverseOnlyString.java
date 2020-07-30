package set1;

import java.util.Scanner;

public class ReverseOnlyString {
	static int size = 0;

	public static void main(String[] args) {

		ReverseOnlyString obj = new ReverseOnlyString();
		Scanner sc = new Scanner(System.in);
		System.out.println("============= REVERSE ONLY STRING PROGRAM ====================");
		System.out.print("Enter the String : ");
		String inputString = sc.nextLine();

		// creating character Array
		size = inputString.length();
		char charArray[] = new char[size + 1];
		charArray[size] = ' ';

		// copying Characters from String to charArray
		for (int index = 0; index < size; index++) {
			charArray[index] = inputString.charAt(index);
		}

		int start = 0;
		for (int index = 0; index < size + 1; index++) {

			// checking wether the character is digit or "."
			if ((((int) charArray[index] >= 48) && ((int) charArray[index] <= 57)) || ((int) charArray[index] == 46)) {
				System.out.print(charArray[index]);
				continue;
			}

			if (charArray[index] == ' ') {
				System.out.print(obj.reverse(start, index - 1, charArray) + " ");
				start = index + 1;
			}

		}

		sc.close();
	}

	// reverse method
	public String reverse(int start, int end, char charArray[]) {
		String reverse = "";
		for (int index = end; index >= start; index--) {
			if (((int) charArray[index] >= 65) && ((int) charArray[index] <= 122)) {

				reverse += charArray[index];

			}
		}
		return reverse;

	}

}
