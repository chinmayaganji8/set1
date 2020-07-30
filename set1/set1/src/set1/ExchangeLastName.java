package set1;

import java.util.Scanner;

public class ExchangeLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name and last name seperated by '-' ");
		System.out.print("\nEnter the name of first person : ");
		String name1 = sc.nextLine();
		System.out.print("Enter the name of Second person : ");
		String name2 = sc.nextLine();
		ExchangeLastName obj = new ExchangeLastName();

		String Modified = obj.exchangeLastNames(name1, name2);
		System.out.println("================== AFTER EXCHANGING LASTNAMES =====================");
		System.out.println(Modified);

		sc.close();

	}

	// method for finding Firstname
	public String Firstname(String name) {
		String firstname = "";
		for (int index = 0; index < name.length(); index++) {

			if (name.charAt(index) != '-' && name.charAt(index) != ' ') {
				firstname += name.charAt(index);
			}

			else {
				break;
			}
		}

		return firstname;
	}

	// method for finding Lastname
	public String Lastname(String name) {
		int count = 0;
		String lastname = "";
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == '-' || name.charAt(index) == ' ') {
				count += 1;

			}
			if (count == 1) {
				lastname += name.charAt(index);
			}
		}
		return lastname;

	}

// method for exchanging last names
	public String exchangeLastNames(String name1, String name2) {

		String name = Firstname(name1);
		name += Lastname(name2);

		String Secondname = Firstname(name2);
		Secondname += Lastname(name1);

		System.out.println(name + " " + Secondname);
		// copying modified names
		String Names = name + "\n" + Secondname;
		return Names;

	}

}
