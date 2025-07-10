package Conditionals;
import java.util.Scanner;

public class youngestAge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter age of Ram: ");
		int age_of_Ram = scan.nextInt();
		System.out.print("Enter age of Shyam: ");
		int age_of_Shyam = scan.nextInt();
		System.out.print("Enter age of Ajay: ");
		int age_of_Ajay = scan.nextInt();
		if (age_of_Ram < age_of_Shyam) {
			if (age_of_Ram < age_of_Ajay) {
				System.out.println("Ram has youngest age: "+age_of_Ram+" years.");
			}
			else {// age_of_Ajay <= age_of_Ram
				System.out.println("Ajay has youngest age: "+age_of_Ajay+" years.");
				
			}
		
		}
		else {
			if(age_of_Shyam < age_of_Ajay) {
				System.out.println("Shyam has youngest age: "+age_of_Shyam+" years.");
				
			}
			else {// age_of_Ajay<age_of_Shyam
				System.out.println("Ajay has youngest age: "+age_of_Ajay+" years.");
			}
		}
		
	}

}
