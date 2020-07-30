package set1;

import dataTypes.integer;
import java.util.Scanner;
import java.util.Random;

public class CreatePassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=0;
		System.out.println("============= PASSWORD GENERATOR =====================");
		System.out.print("Enter your complete name consists of firstname , middlename , Lastname  : ");
		String name = sc.nextLine();
		do {
			System.out.print("Enter your age : ");
			age = integer.integerInput();
		}while(age<=0 || age>110);
		
		CreatePassword obj = new CreatePassword();
		String initials = obj.initials(name);
		System.out.println("Your Password is : "+obj.createPassword(age, initials));

		sc.close();

	}

	// creating Password
	String createPassword(int age, String initials) {
		Random rand = new Random();
		int rand_int = rand.nextInt(1000);
		String Password = initials + "@" + age + "#" + rand_int;
		return Password;

	}

	// capturing initials
	public String initials(String name) {
		String initials = "" +ToUppercase(name.charAt(0)) ;
		for (int index = 1; index < name.length(); index++) {
			char isSpace = name.charAt(index);

			if (isSpace == ' ') {
				char Upper =ToUppercase(name.charAt(index + 1));
				initials += Upper;

			}
		}
		return initials;
	}

	// Convert to Upper case
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
