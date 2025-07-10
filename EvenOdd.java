package Conditionals;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		
		if(n%2 == 0) System.out.println("Even.");
		//if(n%2 == 1) System.out.println("Odd");
		else System.out.println("odd");
		
	}

}
