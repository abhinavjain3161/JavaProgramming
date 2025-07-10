package Conditionals;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = scan.nextInt();
		char op = scan.next().charAt(0);
		System.out.print("enter 2nd number: ");
		int b = scan.nextInt();
		
		if(op=='+') System.out.println(a+b);
		if(op=='-') System.out.println(a-b);
		if(op=='*') System.out.println(a*b);
		if(op=='/') System.out.println(a/b);
	}

}
