package Programs;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,4,3,45,676,454,23,56,788,89};
		System.out.println("Array before sorting");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr);
		System.out.println("Array after sorting");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
