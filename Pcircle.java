import java.util.Scanner;
public class Pcircle {
// WAJP TO read radius of a circle calculate and print the area and circumference of circle
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius =sc.nextDouble();
		//area= pi*radius*radius//Math.PI
		double area=Math.PI*(radius*radius);
		System.out.println("area of circle is: "+area);
		//Circumference = 2*pi*radius
		double Circumference = Math.PI*2*radius;
		System.out.println("The Circumference of the circle is: "+Circumference);

	}

}
