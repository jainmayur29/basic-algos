package Programs;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isprime(int n) {
		boolean m = true;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				m = false;
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = sc.nextInt();
		boolean result = isprime(input);
		if(result==true) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}
	}

}
