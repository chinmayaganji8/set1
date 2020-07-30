package set1;

import dataTypes.integer;

public class GetMax {

	public static void main(String[] args) {
	
		System.out.println("Enter the 3 elements to compare : ");
		int a = integer.integerInput();
		int b = integer.integerInput();
		int c = integer.integerInput();
		GetMax g = new GetMax();
		int Greater = g.getMax(a, b, c);
		System.out.println("The Greatest of " + a + "," + b + "," + c + " is : " + Greater);

	}

	//method returns greatest number
	public int getMax(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}

}
