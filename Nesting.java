package Conditionals;
import java.util.Scanner;

public class Nesting {
	public static void main(String[] args) {
		// greatest of three numbers using nesting if-else
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = scan.nextInt();
		System.out.print("Enter second number: ");
		int n2 = scan.nextInt();
		System.out.print("Enter third number: ");
		int n3 = scan.nextInt();
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println(n1+" is greatest.");
			}
			else {// n3>=n1
				System.out.println(n3+" is greatest.");
			}
		}
		else {// n2 >= n1
			if(n2 > n3) {
				System.out.println(n2+" is greatest.");
			}
			else {// n3>=n2>=n1
				System.out.println(n3+" is greatest.");
			}
				
				
		}
		
	}

}
