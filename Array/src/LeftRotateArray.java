
public class LeftRotateArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		leftRotateArray(arr,2);
	}

	private static void leftRotateArray(int[] arr, int d) {
		int i=0;
		for(i=0;i<d;i++){
			leftRotateArray(arr);
		}
		
		for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
	}

	private static void leftRotateArray(int[] arr) {
		int i=0;
		int temp = arr[0];
		for(i=0;i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		
		arr[i] = temp;
		
	}
}
