package Conditionals;
import java.util.Scanner;

public class ValidTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first side of a triangle: ");
		int a = scan.nextInt();
		System.out.print("Enter second side of a triangle: ");
		int b = scan.nextInt();
		System.out.print("Enter third side of a triangle: ");
		int c = scan.nextInt();
		
		if ((a+b) > c && (b+c) > a && (a+c) > b) System.out.println("Valid Triangle.");
		else System.out.println("Invalid Triangle.");
		
	}

}
