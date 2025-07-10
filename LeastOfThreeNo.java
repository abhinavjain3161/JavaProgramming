package Conditionals;
import java.util.Scanner;

public class LeastOfThreeNo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = scan.nextInt();
		System.out.print("Enter second number: ");
		int n2 = scan.nextInt();
		System.out.print("Enter Third number: ");
		int n3 = scan.nextInt();
		if (n1<=n2 && n1<=n3) {
			System.out.println(n1+" is least number.");
			
		}
		else if (n2<=n1 && n2 <= n3) {
			System.out.println(n2+" is least number.");
		}
		else {
			System.out.println(n3+" is least number.");
		}
		
	}

}
