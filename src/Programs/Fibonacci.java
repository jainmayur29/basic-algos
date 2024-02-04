package Programs;

import java.util.Scanner;

public class Fibonacci {
	public static void fib(int num) {
		int firstTerm = 0;
		int secondTerm=1;
		System.out.print(firstTerm+" "+secondTerm+" ");
		for(int i=2;i<num;i++) {
			int next = firstTerm+secondTerm;
			System.out.print(next+" ");
			firstTerm= secondTerm;
			secondTerm = next;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term");
		int input = sc.nextInt();
		fib(input);
		
	}

}
