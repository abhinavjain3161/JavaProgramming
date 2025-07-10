package Conditionals;

public class rectangle {
	public static void main(String[] args) {
		double length = 12.59;
		double breadth = 5.89;
		double area = length * breadth;
		double perimeter = 2*(length + breadth);
		if (area > perimeter) {
			System.out.println(" area is greater than perimeter of rectangle.");
			System.out.println("area is: " + area +"and Perimeter is "+ perimeter);
			
		}
		else {
			System.out.println("area is less than perimeter of rectangle.");
			System.out.println("area = "+area+ "and Perimeter = "+perimeter);
		}
	}

}
