package set1;

import dataTypes.LongNumber;

public class isPrime {

	public static void main(String[] args) {
		long number=0;
        System.out.println("============ PRIME NUMBER PROGRAM ===============");
        do {
        	System.out.print("Enter the number you want to check: ");
    		number = LongNumber.LongInput();
        }while(number<0);
		
		isPrime p = new isPrime();
		System.out.println(p.Isprime(number));

	}

	// method to check the given number is prime or not
	boolean Isprime(long number) {
		int count = 0;
		for (int loop = 2; loop < number; loop++) {
			if ((int) number % loop == 0) {
				count += 1;
				break;
			}

		}
		if (count > 0) {
			return false;
		}

		else {
			return true;
		}
	}

}
