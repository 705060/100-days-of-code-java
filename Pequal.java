import java.util.Scanner;
public class Pequal {
//WAJP to read two integer value from user and print those two integer are equal or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer");
		int a=sc.nextInt();
		int b=sc.nextInt();
		   
		// int equal=a;
		if(a==b)
			System.out.println("equal");
		if(a!=b)
			System.out.println("not equal");
		
	}

}
