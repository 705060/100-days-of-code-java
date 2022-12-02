import java.util.Scanner;
public class Doubbig {
// WAJP TO Read 4 double type value from the user and print biggest one
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Four double values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		if(a>b && a>c && a>d)
			System.out.println(a+ "is biggest");
		else if(b>c && b>d)
			System.out.println(b+" is biggest");
		else if(c>d)
			System.out.println(c+" is biggest");
		else
			System.out.println(d+" is biggest");
			

	}

}
