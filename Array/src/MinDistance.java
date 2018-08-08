
public class MinDistance {

	public static int minDistance(int nums[], int a, int b)    {
        if(nums.length == 0)
            return 0;
        int prev = 0;
        int prevIdx = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; ++i)    {
            if(nums[i] == a || nums[i] == b)    {
                if(i != 0 && nums[i] != prev) {
                    min = Math.min(min, i - prevIdx);
                }
                prev = nums[i];
                prevIdx = i;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
	
	 public static void main(String[] args) {
	        int arr[] = { 6, 6, 5, 4, 8, 3};
	        int n = arr.length;
	        int x = 3;
	        int y = 6;
	 
	        System.out.println("Minimum distance between " + x + " and " + y
	                + " is " + minDistance(arr, x, y));
	    }
}	
