
public class MinDistinctSum {
	public static void main(String[] args) {
		int arr[] = { 3,4,6,8};
		distinctSum(arr);
	}

	private static void distinctSum(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] == arr[i+1]){
				arr[i+1] = arr[i]+1;
			}
		}
		
		if(arr[arr.length-1] == arr[arr.length-2]){
			arr[arr.length-1] = arr[arr.length-2]+1;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
