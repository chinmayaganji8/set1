package set1;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		
		Initials obj= new Initials();
		System.out.println("=========== Capturing Initials ================");
		System.out.print("Enter the name : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String initials=obj.initials(name);
		System.out.println("Initials are : "+initials);
		sc.close();
	}

	public String initials(String name){
		int size = name.length();
		String initials="";
	   for(int index=0;index<size;index++) {
	    	 char c=  name.charAt(index);
	    	 int ascii= (int)c;
	    			 
	    	 if((ascii>=65)&&(ascii<=90)){
	    	 	initials+=(char)ascii;
	    		
	    	 }

	    	 
	     }
	     return initials;
	}
	

}

