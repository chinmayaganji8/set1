package set1;
import dataTypes.integer;
import arrays.Array;

import java.util.Scanner;

public class Sortings {

	public static void main(String args[]) {
		int size;
		Sortings ob = new Sortings();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		size = integer.integerInput();
		
		int Isort[] = new int[size];
		Array.EnterElementsIntoTheArray(Isort);
		
		int[] BSort = new int[size];
		BSort = Isort;

		ob.Insertionsort(Isort);
		System.out.println("After Insertion Sort : ");
		Array.Print(Isort);

		System.out.println();
		System.out.println("=================================================");
		ob.Bubblesort(BSort);
		System.out.println("After Bubble Sort : ");
		Array.Print(BSort);

		sc.close();

	}

//Insertion Sort	
	public void Insertionsort(int[] nums) {
		for (int index = 1; index < nums.length; index++) {
			int value = nums[index];
			int iterator = index - 1;
			while (iterator >= 0 && nums[iterator] > value) {
				nums[iterator + 1] = nums[iterator];
				iterator = iterator - 1;
			}
			nums[iterator + 1] = value;
		}
	}

//Bubble sort
	public void Bubblesort(int[] nums) {

		for (int iterator = 0; iterator < nums.length; iterator++) {
			for (int index = 0; index < nums.length - index - 1; index++) {
				if (nums[index] >= nums[index + 1]) {
					int temp = nums[index];
					nums[index] = nums[index + 1];
					nums[index + 1] = temp;
				}

			}
		}

	}

}
