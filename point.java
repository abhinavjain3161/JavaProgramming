package Conditionals;

public class point {
	public static void main(String[] args) {
		double x = 0.0 , y = 1.0;
		System.out.println("Point is "+"("+x+","+y+")");
		if (x>0 && y>0) {
			System.out.println("Point  "+"("+x+","+y+") lies in 1st Quadrant.");
		}
		else if (x<0 && y>0) {
			System.out.println("Point  "+"("+x+","+y+") lies in 2nd Quadrant.");
		}
		else if (x < 0 &&  y<0) {
			System.out.println("Point  "+"("+x+","+y+") lies in 3rd Quadrant.");
		}
		else if (x > 0 && y<0) {
			System.out.println("Point  "+"("+x+","+y+") lies in 4th Quadrant.");
		}
		else if (y==0) {
			System.out.println("Point  "+"("+x+","+y+") lies on x-axis.");
		}
		else if( x == 0) {
			System.out.println("Point  "+"("+x+","+y+") lies on y-axis.");
		}
		else {
			System.out.println("Point  "+"("+x+","+y+") lies on origin.");
		}
	
		
		
	}
}
