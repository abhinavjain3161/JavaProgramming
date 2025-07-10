package Conditionals;
import java.util.Scanner;

public class ThreeDigitNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		if (n>99 && n<1000) {
			System.out.println("3 Digit number.");
		}
		else {
			System.out.println("Not a 3 Digit number.");
		}
		
	}

}
