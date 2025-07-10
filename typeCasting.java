package Basics;
import java.util.Scanner;

public class typeCasting {
	public static void main(String[] args) {
		// half of given integer
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double y = (double) x;
		System.out.println(y/2);
		
//		double y = scan.nextDouble();
//		int x = (int) y;
//		System.out.println(x);
		
	}

}
