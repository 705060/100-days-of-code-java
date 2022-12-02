import java.util.Scanner;
public class Pneg {
//WAJP to read one integer value from the user and print that integer is positive or negitive
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one integer");
		int a =sc.nextInt();
		
		if(a>0)
			System.out.println("positive");
		if(a<0)
			System.out.println("negitive");
		if(a==0)
			System.out.println("neither positive nor negitive");
		

	}

}
