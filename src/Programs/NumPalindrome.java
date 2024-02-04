package Programs;

import java.util.Scanner;

public class NumPalindrome {
	
	public static int rev_num(int a) {
		int num = a;
		int p=0;
		while(num>0) {
			int m = num%10;
			p = p*10+m;
			num=num/10;			                   
		}
	return p;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int input = sc.nextInt();
		int rev = rev_num(input);
		if(rev==input) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}	
	}

}
