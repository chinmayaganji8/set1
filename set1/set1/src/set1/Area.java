package set1;

import dataTypes.*;

public class Area {
	public static void main(String[] args) {

		int typeOfPolygon = 0;
		
		//creating object for the class 
		Area obj = new Area();
		
		do {

			//calling displayMenu method
			obj.displayMenu();
			
			//reading the type of polygon
			typeOfPolygon = integer.integerInput();

			switch (typeOfPolygon) {

			case 1:
				System.out.print("Enter the height of the triangle : ");
				float Triangleheight = FloatingPoint.floatInput();
				System.out.print("Enter base of the triangle : ");
				float base = FloatingPoint.floatInput();

				// calling triangleArea method
				System.out.print("\nThe Area of the Triangle is :");
				System.out.println(obj.triangleArea(base, Triangleheight));
				break;

			case 2:
				System.out.print("Enter width  of the Rectangle : ");
				float width = FloatingPoint.floatInput();
				System.out.print("Enter height of the Rectangle : ");
				float height = FloatingPoint.floatInput();

				// calling rectangleArea method
				System.out.print("\nThe Area of the Rectangle is :");
				System.out.println(obj.rectangleArea(width, height));
				break;

			case 3:
				System.out.print("Enter the side of the Square : ");
				float side = FloatingPoint.floatInput();

				// calling squareArea method
				System.out.print("\nThe Area of the Square is : ");
				System.out.println(obj.squareArea(side));
				break;

			case 4:
				System.out.println("\nEnter the radius of the circle");
				float radius = FloatingPoint.floatInput();

				// calling squareArea method
				System.out.println(obj.circleArea(radius));
				System.out.print("\nThe Area of the Circle is : ");
				break;
				
		  case 5:
			  System.out.println("Thanks for Using Area.java\nYou are Exited from the Program .......");
			  System.exit(0);
			default:
				System.out.println("Choose a Valid Option from the Menu : ");
			}

		} while (typeOfPolygon > 0 || typeOfPolygon < 0);

	}

	// method to calculate triangle area

	public float triangleArea(float base, float height) {
		return 0.5f * base * height;
	}

	// method to calculate Square area

	public float squareArea(float side) {
		return side * side;
	}

	// method to calculate rectangle area

	public float rectangleArea(float width, float height) {
		return width * height;
	}

	// method to calculate circle area

	public float circleArea(float radius) {
		return 3.14f * radius * radius;
	}

	// method to display the Menu
	void displayMenu() {
		System.out.println("\n========= Area Calculator ===========\n" + "1.Triangle\n" + "2.Rectangle\n" + "3.Square\n"
				+ "4.Circle\n" + "5.Exit "+"\nCHOOSE YOUR OPTION FROM ABOVE MENU ....\n");
	}

}
