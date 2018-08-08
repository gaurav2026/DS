
public class BinarySearch {

	public static boolean isPresent(int arr[], int low, int high, int elementToBeSearched) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Array can't be empty");
		}
		while (low <= high) {
			int mid = (low + high - 1) / 2;
			if (arr[mid] == elementToBeSearched) {
				return true;
			} else if (arr[mid] < elementToBeSearched) {
				low = mid + 1;
			} else {
				high = mid-1;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		System.out.println(isPresent(arr, 0, arr.length - 1, 4));
	}
}
