package set1;

import java.util.Scanner;

public class Compareto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String firstString = sc.next();
		System.out.print("Enter Second String : ");
		String SecondString = sc.next();

		System.out.println(firstString.compareTo(SecondString));

		sc.close();
	}

}
