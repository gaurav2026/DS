import java.util.Arrays;

public class FormMax {
	public static void main(String[] args) {
		int[] arr = {3, 30, 34, 5, 9};
	}
	
	public int formMaxNumber(int[] arr){
		String largestString = "0";
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			
		}
		return -1;
	}
	
	private String returnLargest(String x, String y){
		String xy = x+y;
		String yx = y+x;
		
		if(Integer.parseInt(xy) > Integer.parseInt(yx)){
			return xy;
		}else{
			return yx;
		}
			
	}
}
