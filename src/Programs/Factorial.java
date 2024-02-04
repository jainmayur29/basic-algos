package Programs;

import java.util.Scanner;

public class Factorial {
	
  public static int factorial(int s) {
	  int fact = 1;
	  for(int i=2;i<=s;i++) {
		  fact= fact*i;
	  }
	  return fact;
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int input = sc.nextInt();
		int m= factorial(input);
		System.out.println(m);
	}
}
