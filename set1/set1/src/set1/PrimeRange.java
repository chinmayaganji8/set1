package set1;

import dataTypes.LongNumber;


public class PrimeRange {
   static long[] prime;
	public static void main(String[] args) {
		long start=0;
		long end=0;
		System.out.println("========= PRIME NUMBER PROGRAM ==========");
		do {
			System.out.print("Enter starting Number(i.e >0) in the range : ");
			 start = LongNumber.LongInput();	
		}while(start<=0);
		do {
			System.out.print("Enter Ending Number (i.e > "+start+" ) in the range : ");
			 end = LongNumber.LongInput();	
		}while(end<start);
		 
		PrimeRange p = new PrimeRange();
        prime=new long[(int) (end-start)+1];
		// checking number from start to end
		p.Range(start, end);
		
		// printing
		int index=0;
		System.out.println("============================================");
		System.out.println("The Prime Numbers in the Range ("+start+","+end+")"+" are : ");
		while(prime[index]!=0) {
			System.out.print(prime[index]+" ");
			index+=1;
		}

	}

	// iterating through the Range
	public void Range(long start, long end) {
		for (long loop = start; loop <= end; loop++) {
			Isprime(loop);
		}
	}

// method for checking whether it's Prime or not
	static int index=0;
	public static void Isprime(long number) {
		int count = 0;
	
		for (int loop = 2; loop < number; loop++) {
			if ((int) number % loop == 0) {
				count += 1;
				break;

			}
		}

		if (count == 0) {
			prime[index]=number;
			index+=1;
		}

	}

}
