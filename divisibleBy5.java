package Conditionals;
import java.util.Scanner;

public class divisibleBy5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		if (n%5==0) System.out.println(""+n+"is divisible by 5.");
		else System.out.println(n+ " is not divisible by 5.");
		
		
		
	}

}
