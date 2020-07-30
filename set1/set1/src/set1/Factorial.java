package set1;
import dataTypes.integer;


public class Factorial {

	public static void main(String[] args) {
		
        Factorial obj= new Factorial();
	    long fact=0;
	    int number=0;
		System.out.println("====== FACTORIAL OF A NUMBER ======");
		do{
			  System.out.print("Enter A Positive Number : ");
		         number=integer.integerInput();
		}while(number<0);
      
        fact=obj.factorial(number);
        System.out.println("The Factorial of "+number+" is "+fact);
     
	}
	
	//factorial method
	public long factorial(int number) {
		long fact=1;
	for(int loop=1;loop<=number;loop++) {
		fact*=loop;
	}
	return fact;
	}
	

}
