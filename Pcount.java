import java.util.Scanner;
public class Pcount {
//write a method for count of prime number present in user entered number 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int x = countPrime(n);
		System.out.println("Number of Prime are :"+x);

	}
	static int countPrime(int n) {
		int count =0;
		do {
			int d= n % 10;
			boolean r =isPrime(d);
			if(r == true) {
				count++;
			}
			n= n/10;
		}while(n!= 0);
		return count;
	}
	static boolean isPrime(int x) {
		int count=0;
		for(int i= 2; i<=x/2; i++) {
			if(x % i == 0)
				return false;
		}
		return true;
}
}