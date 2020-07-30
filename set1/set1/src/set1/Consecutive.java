package set1;

import java.util.*;

public class Consecutive {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("============= Finding Consecutive Characters and their Frequency================");
		System.out.print("Enter the String:");
		String input = sc.nextLine();
		String UpperCase = "";

		// converting all characters to upper case
		for (int index = 0; index < input.length(); index++) {
			UpperCase += ToUppercase(input.charAt(index));
		}

		// printing consecutive characters and their frequency
		String ConsecutiveChars=getConsecutiveChars(UpperCase);
		if(ConsecutiveChars.length()>1)
		System.out.println(ConsecutiveChars);
		else
			System.out.println("No Consecutive Characters Found...!");
		sc.close();
	}

//method to find consecutive characters and their frequency
	static String getConsecutiveChars(String inputString) {
		int ascii = 65, count = 0;
		String consecutive = "";
		char firstchar = '0';
		char secondchar = '0';
		while (ascii <= 90) {
			count = 0;
			for (int index = 1; index < inputString.length(); index++) {
				if ((inputString.charAt(index - 1) == (char) (ascii))
						&& (inputString.charAt(index) == (char) (ascii + 1))) {
					firstchar = inputString.charAt(index - 1);
					secondchar = inputString.charAt(index);
					count+=1;

				}
			}
			if (count > 1) {
				consecutive = consecutive + firstchar + secondchar + " " + ":" + " " + count + "\n";
			}
			ascii+=1;
		}
		return consecutive;

	}

	//to Upper case
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