package set1;

import java.util.Scanner;

public class USN {
	static String usn;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("============= CHOOSE YOUR OPTION ============\n" + "To Exit from Menu type 'exit'\n");
		do {
			System.out.print("Enter your USN : ");
			usn = sc.nextLine();
			System.out.println("==============================================");
			if (ValidateUSN(usn)) {
				System.out.println("Successful USN : " + usn);
			} else
				System.out.println("Faliure USN : " + usn);

		} while (!ValidateUSN(usn));
		sc.close();
	}

	public static boolean ValidateUSN(String usn) {
		int length = usn.length();
		if (length == 10) {
			if (((usn.charAt(0)) == '1') || (usn.charAt(0)) == '2') {
				char SecondChar = usn.charAt(1);
				char ThirdChar = usn.charAt(2);
				int inputString = (int) SecondChar;
				int b = (int) ThirdChar;
				if (((inputString >= 65) && (inputString <= 90)) && ((b >= 65) && (b <= 90))) {
					char FourthChar = usn.charAt(3);
					char FifthChar = usn.charAt(4);
					int ab = (int) FourthChar;
					int bc = (int) FifthChar;
					if (((ab >= 48) && (ab <= 57)) && ((bc >= 48) && (bc <= 57))) {
						if (((usn.charAt(5) == 'C') && (usn.charAt(6) == 'S'))
								|| ((usn.charAt(5) == 'I') && (usn.charAt(6) == 'S'))
								|| ((usn.charAt(5) == 'E') && (usn.charAt(6) == 'C'))
								|| ((usn.charAt(5) == 'M') && (usn.charAt(6) == 'E'))) {
							char EightChar = usn.charAt(7);
							char NineChar = usn.charAt(8);
							int asci8 = (int) EightChar;
							int asci9 = (int) NineChar;
							if (((asci8 >= 48) && (asci8 <= 57)) && ((asci9 >= 48) && (asci9 <= 57))) {
								char TenthChar = usn.charAt(9);
								int asci10 = (int) TenthChar;
								if ((asci10 >= 48) && (asci10 <= 57)) {
									return true;

								} else {
									return false;
								}

							} else {
								return false;
							}
						} else {
							return false;
						}
					} else {
						return false;
					}

				} else {
					return false;
				}

			} else {
				return false;
			}

		} else {
			return false;
		}

	}

}
