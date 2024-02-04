package Programs;

import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearch(int[] arr,int input) {
		boolean present = false;
		for(int i: arr) {
			if(i==input) {
				present= true;
				System.out.println("Element exists at "+i);
				break;
			}
			else {
				continue;
			}
		}
		if(present==false) {
			System.out.println("Element does not exist");
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,45,67,8,12,45};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = sc.nextInt();
		linearSearch(arr,input);
	}

}
