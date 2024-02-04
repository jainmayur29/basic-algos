package Programs;

public class BubbleSort {
	
	public static void bubbleSort(int[] a) {
		int size = a.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;	
				}
			}
		}
	}
	public static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {12,2,3,45,4,9,10};
		bubbleSort(arr);
		printArray(arr);
		
		
	}

}
