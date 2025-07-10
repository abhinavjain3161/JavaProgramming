package Conditionals;
import java.util.Scanner;

public class ProfitandLoss {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter cost price: ");
		double cp = scan.nextDouble();
		System.out.print("Enter selling price: ");
		double sp = scan.nextDouble();
		if (sp > cp){
			System.out.println("Seller has made profit.");
			System.out.println("Profit = Rs "+(sp-cp));
			
		}
		else if (sp == cp){
			System.out.println("Seller has made no profit no loss.");
			
			
			
		}
		else {
			System.out.println("Seller has incurred loss of Rs "+(cp-sp));
		}
		
	}

}
