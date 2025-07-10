package Conditionals;
import java.util.Scanner;

public class EvenOrOddUsingTernaryOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		
		System.out.println((n%2==0) ? "Even":"Odd");
		
	}

}
