package Conditionals;
import java.util.Scanner;


public class fiveDigit {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int n = scan.nextInt();
			if (n>9999 && n<100000) {
				System.out.println("5 Digit number.");
			}
			else {
				System.out.println("Not a 5 Digit number.");
			}
			
		}

	}



