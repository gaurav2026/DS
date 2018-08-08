
public class Reverse {
	/*
	 * My Name is gaurav
	 * gaurav is Name My
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		String s = "My Name is gaurav";
		printArray(arr);
		reverseArray(arr, 0, 5);
		System.out.println("Reversed array is ");
		printArray(arr);
		System.out.println();
		reverse(s);
		
	}

	private static void reverseArray(int[] arr, int start, int end) {
		if (start > end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		reverseArray(arr, start + 1, end - 1);
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void reverse(String s){
		String str[] = s.split("\\s+");
		for(int i=0,j=str.length-1;i<str.length/2;i++,j--){
			String temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			
		}
		
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]+" ");
		}
		
	}
	
}
