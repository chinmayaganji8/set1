package set1;

import dataTypes.integer;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("====== Tables Program =======");
		System.out.print("Enter the Number : ");
		int Number = integer.integerInput();
		PrintTables(Number);
		Sc.close();

	}

	public static void PrintTables(int Number) {
		for (int loop = 1; loop <= 12; loop++) {
			System.out.println(Number + " " + "X" + " " + loop + " " + "=" + " " + Number * loop);
		}
	}

}
