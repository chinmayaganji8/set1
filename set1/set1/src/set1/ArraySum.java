package set1;

import dataTypes.*;
import arrays.*;

public class ArraySum {

	public static void main(String[] args) {
		ArraySum obj = new ArraySum();
		System.out.print("Enter the Size of the Array : ");
		int size = integer.integerInput();
		int[] array = new int[size];
		
		//calling enterElementsIntoTheArray from arrays.Array class
		Array.EnterElementsIntoTheArray(array);
        
		// calling arraySum method
		int sum=obj.arraySum(array);
		
		System.out.println("The sum of the Array elements is : "+sum);

	}

	public int arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		return sum;
	}

}
