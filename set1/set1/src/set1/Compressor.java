package set1;

import java.util.Scanner;

public class Compressor {
	static int length = 0;
	static int size = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============== COMPRESSOR ==================");
		System.out.print("Enter the String you Want to Compress : ");

		// Reading input from the user
		String inputString = sc.next();

		Compressor obj = new Compressor();

		size = inputString.length();
		length = size;

		// creating character Array to store all the characters from the input String
		char charArray[] = new char[size];

		// converting all characters in the array to lower case

		for (int index = 0; index < size; index++) {
			char character = inputString.charAt(index);
			charArray[index] = ToLowercase(character);

		}

		// calling Compress method
		String compressedString = obj.Compress(charArray);
		int compressedStringLength = compressedString.length();

		if (compressedStringLength > length) {
			System.out.println("Cannot compress " + inputString);
		} else
			System.out.println(inputString + " is Compressed to " + compressedString);

		sc.close();

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

	public String Compress(char[] charArray) {

		String CompressedString = "";
		for (int index = 0; index < size; index++) {
			int count = 0;

			char character = charArray[index];

			// checking the frequency of the chatacter;
			for (int iterator = index; iterator < size; iterator++) {
				if (character == charArray[iterator]) {
					count += 1;
					index = index + count;
				} else {
					index = iterator - 1;
					break;
				}
			}
			// appending characters and their count
			CompressedString += character;
			CompressedString += count;

		}
		return CompressedString;

	}
}