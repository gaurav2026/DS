
public class NearestSquareNumber {
	
	public static boolean isSquareNumber(int n){
		long high = n/2;
		long low = 0;
		while(low<=high){
			long mid = (low+high)/2;
			long val = mid*mid;
			if(val == n){
				return true;
			}else if(val<n){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		boolean status = false;
		int nearestNumber = -1;
		
		for(int i=17;i>1;i--){
			status = isSquareNumber(i);
			if(status){
				nearestNumber = i;
				break;
			}
		}
		
		System.out.println(nearestNumber);
	}
}
