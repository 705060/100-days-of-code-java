import java.util.Scanner;
public class Precta {
//WAJP TO read the length and width of ractangel and print the area and perimeter of that ractangel
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length ractangle: ");
		System.out.println("Enter the width of ractangel: ");
		double length =sc.nextDouble();
		double width =sc.nextDouble();
		
		double area = length*width;
		double perimeter = 2*length+2*width;
		System.out.println("area of ractangle is: "+area);
		System.out.println("perimeter of ractangle is: "+perimeter);

	}

}
