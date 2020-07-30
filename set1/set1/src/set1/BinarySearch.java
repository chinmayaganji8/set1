package set1;

import dataTypes.*;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BinarySearch obj = new BinarySearch();

		int intArr[] = { 1, 2, 3, 4, 5, 9, 11, 25, 18 };
		String stringArr[] = new String[] { "a", "is", "man", "good", "Chinmaya" };

		int Search;
		int high = intArr.length - 1;
		int highStr = stringArr.length - 1;
		int option = 0;
		int low = 0;

		do {
			System.out.println("==================== CHOOSE YOUR OOPTION =====================");
			System.out.println("1.BinarySearch for Integers\n2.BinarySearch for Strings\n3.Exit ");
			option = integer.integerInput();
			switch (option) {
			case 1:
				System.out.print("Enter the element you want to Search : ");
				Search = integer.integerInput();

				if (obj.binarySearch(Search, low, high, intArr)) 
					System.out.println(Search + " Found");
				else {
					System.out.println(Search + " Not Found");
				}
				break;

			case 2:
				System.out.print("Enter the String you want to search : ");
				String findString = sc.next();

				if (obj.binarySearch(findString, low, highStr, stringArr))
					System.out.println(findString + " Found");
				else {
					System.out.println(findString + " Not Found");
				}

				break;

			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("Choose a Valid Option");
			}

		} while (option > 0 || option <= 0); // repeat until the user enter a valid Input

		sc.close();
	}

	boolean binarySearch(int Search, int low, int high, int intArr[]) {

		if (high >= low) {
			int mid = low + (high - low) / 2;

			if (intArr[mid] == Search)
				return true;

			if (intArr[mid] > Search)
				return binarySearch(Search, low, mid - 1, intArr);

			return binarySearch(Search, mid + 1, high, intArr);
		}

		return false;
	}

	// @overloading binarySearch

	boolean binarySearch(String findString, int low, int high, String stringArr[]) {

		if (high >= low) {
			int mid = low + (high - low) / 2;

			if (stringArr[mid].equals(findString))
				return true;

			if (stringArr[mid].length() > findString.length())
				return binarySearch(findString, low, mid - 1, stringArr);

			return binarySearch(findString, mid + 1, high, stringArr);
		}

		return false;
	}

}