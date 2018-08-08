
public class ProductExceptAtIndex {
	public static void main(String[] args) {
		int arr[] = {1,7,3,4};
		productExceptAtIndex(arr);
		System.out.println();
		prod(arr);
	}

	private static void productExceptAtIndex(int[] arr) {
		int productSoFar = 1;
		int productExceptAtIndex[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			productExceptAtIndex[i] = productSoFar;
			productSoFar *= arr[i];
		}
		
		productSoFar = 1;
		
		for(int i=arr.length-1;i>=0;i--){
			productExceptAtIndex[i] *= productSoFar;
			productSoFar *= arr[i];
		}
		
		for(int i=0;i<productExceptAtIndex.length;i++){
			System.out.print(productExceptAtIndex[i] + " ");
		}
	}
	
	private static void prod(int[] arr){
		int productSoFar = 1;
		int productExceptAtIndex[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			productSoFar *= arr[i];
		}
		
		for(int i=0;i<productExceptAtIndex.length;i++){
			productExceptAtIndex[i] = productSoFar/arr[i];
		}
		
		for(int i=0;i<productExceptAtIndex.length;i++){
			System.out.print(productExceptAtIndex[i] + " ");
		}
	}
}
