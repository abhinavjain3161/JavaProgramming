package Conditionals;
import java.util.Scanner;

public class DivisibleBy3Or5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		if (num%3 == 0 || num%5 == 0) {
			System.out.println("number is divisible by 3 or 5.");
		}
		else {
			System.out.println("number is not divisible by 3 or 5.");
		}
			
		
	}

}
