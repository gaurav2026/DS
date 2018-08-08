
public class SquareRoot {
	private static long squareRoot(int num){
		long low = 0;
		long high = num/2;
		long answer = 1;
		while(low<=high){
			long mid = (low+high)/2;
			long val = mid*mid;
			if(val == num){
				return mid;
			}else if(val < num){
				low = mid+1;
				answer = mid;
			}else{
				high = mid-1;
			}
		}
		return (int) Math.floor(answer);
		
	}
	public static void main(String[] args) {
		System.out.println(squareRoot(10));
	}
}
