package Programs;

import java.util.Scanner;

public class StringPalindrome {

	public static String rev_String(String s) {
		String m = "";
		char[] ch = s.toCharArray();
		int len = s.length();
		for (int i = len - 1; i >= 0; i--) {
			m = m + s.charAt(i);
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		String rev = rev_String(input);
		if (rev.equals(input)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}

}
