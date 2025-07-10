package Basics;
import java.util.Scanner;

public class areaOfCircleInout {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scan.nextDouble();
		
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle is: "+area);
		
	}

}
