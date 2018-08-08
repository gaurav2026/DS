import java.util.ArrayList;
import java.util.List;

public class RotatedSortedArray {

	public static int findElement(int arr[], int n, int low, int high) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Size must be more than 1");
		}

		int mid = (low + high) / 2;
		if (arr[mid] == n) {
			return mid;
		}
		// let's assume that low to mid is sorted
		if (arr[low] <= arr[mid]) {
			if (arr[low] <= n && n <= arr[mid]) {
				return findElement(arr, n, low, mid-1);
			}

			return findElement(arr, n, mid+1, high);

		}
		
		/**
		 * low to mid is not sorted
		 * means mid to high is sorted
		 */
		if(arr[mid]<=n && n<=arr[high]){
			return findElement(arr, n, mid+1, high);
		}
		
		
		return findElement(arr, n, low, mid-1);

	}
	
	public static int search(final List<Integer> a, int b) {
	    if(a.size()==0){
	        throw new IllegalArgumentException("Size must be more than 0");
	    }
	   return search(a,b,0,a.size()-1);
	}
	
	private static int search(final List<Integer> a, int b, int low, int high){
		if(low>high){
			return -1;
		}
	    int mid = (low+high)/2;
	    if(a.get(mid)==b){
	        return mid;
	    }
	    System.out.println(low + " *** " + high);
	    if(a.get(low)<=a.get(mid)){
	        if(a.get(low)<=b && b<=a.get(mid)){
	            return search(a,b,low,mid-1);
	        }
	            return search(a,b,mid+1,high);
	    }
	    
	    if(a.get(mid)<=b && b<=a.get(high)){
	        return search(a,b,mid+1,high);
	    }
	    
	    return search(a,b,low,mid-1);
	}
	
	public static void main(String[] args) {
		 int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		 List<Integer> list = new ArrayList<Integer>();
		 list.add(4);
		/* list.add(5);
		 list.add(6);
		 list.add(7);
		 list.add(8);
		 list.add(9);
		 list.add(1);
		 list.add(2);
		 list.add(3);*/
		 //System.out.println(findElement(arr, 3, 0, arr.length-1));
		 System.out.println(search(list, 40));
	}
}
