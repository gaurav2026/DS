import java.util.Arrays;

public class Triplet {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 7, 6, 8, 9 };
		findTriplet(arr,6);
	}

	private static void findTriplet(int[] arr, int k) {
		Arrays.sort(arr);
		int index = 0;
		for(;index < arr.length; index++){
			if(arr[index] > k){
				break;
			}
		}
		
		int left = 0;
		int right = index-1;
		while(left <= right){
			if(arr[left]  * arr[right] == k){
				System.out.println(arr[left] + " * " + arr[right] + " = " + k);
				if (arr[left] != arr[right])
					System.out.println(arr[right] + " * " + arr[left] + " = " + k);
				left++;
			}
			else if(arr[left] * arr[right] < k){
				left++;
			}else{
				right--;
			}
		}
	}
}
