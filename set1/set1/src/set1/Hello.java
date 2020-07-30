package set1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		Hello obj = new Hello();
		System.out.print("Enter your Name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(obj.hello(name));
		sc.close();

	}

	public String hello(String name) {
		String Suffix = "Hello ,";
		name = Suffix + name;
		return name;
	}

}
