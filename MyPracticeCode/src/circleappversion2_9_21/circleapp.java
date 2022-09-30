package circleappversion2_9_21;
import java.util.Scanner; 
public class circleapp {
	public double calcCircleArea(double radius) {
		double area; 
		area = Math.PI * radius * radius; 
		return area; 
	}
	public double calcCircumference(double radius) { 
		double circ; 
		circ = 2 * Math.PI * radius; 
		return circ; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the radius: "); 
		double radius = sc.nextDouble(); 
		circleapp ca = new circleapp(); 
		double area, circumference; 
		area = ca.calcCircleArea(radius);  
		circumference = ca.calcCircumference(radius); 
		System.out.printf("For a circle with a radius %.2f, the area is %.4f and the circumference is %.4f.\n", 
			radius, area, circumference); 
		System.out.println("Have a nice life."); 
		
	}
}
