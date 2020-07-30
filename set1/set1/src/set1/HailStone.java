package set1;

import dataTypes.integer;	

public class HailStone {

	public static void main(String[] args) {
		
    HailStone  obj=new HailStone();
    System.out.println("==== HAILSTONE SEQUENCE ====");
    System.out.print("Enter the number : ");
    int number =integer.integerInput();
    int count=obj.hailStone(number);
    System.out.println("There are total "+count+" steps to reach 1");
   
  }
    
	public int hailStone(int number){
    int count=0;
    while(number!=1) {
        if(number%2==0) {
            
            System.out.println(number+" is even so i take half "+number/2);
            number=number/2;
            count+=1;
        }
        else {
            System.out.println(number+" is odd so i take 3n+1 "+(number*3)+1);
            number=(number*3)+1;
            count+=1;
        }
    }
    return count;
    }

}

