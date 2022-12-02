import java.util.Scanner;
public class Psmall {
// WAJP to read three integer from user and print smallest among three number 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integer value : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int small=a;
		   if(b<small)
			   small=b;
		   if(c<small)
			   small=c;
		   
		   System.out.println("smallest is: "+small);


	}

}
