package Conditionals;
import java.util.Scanner;

public class GreatestOfThreeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = scan.nextInt();
		System.out.print("Enter second number: ");
		int n2 = scan.nextInt();
		System.out.print("Enter Third number: ");
		int n3 = scan.nextInt();
		if(n1>=n2 && n1>=n3) {
			System.out.print(n1+" is greatest.");
		}
		else if(n2>=n1 && n2>=n3) {
			System.out.print(n2+" is greatest.");
		}
		else {
			System.out.print(n3+" is greatest.");
		}
		
	}

}
