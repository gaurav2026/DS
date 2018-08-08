import java.util.ArrayList;

public class MaxTwoDuplicates {

	public ArrayList<Integer> maxTwoDuplicates(ArrayList<Integer> a){
		int upperBound = 0;
		int counter = 0;
		if(a.size()==1){
			return a;
		}
		for(int i=0;i<a.size();i++){
			int upBound = 0;
			upperBound = findUpperBound(a, a.get(i), i);
			int lowBound = a.get(i);
			if(i+1 < a.size())
				upBound = a.get(i+1);
			if(i<= a.size()-1 && lowBound==upBound){
				a.set(counter++, a.get(upperBound));
				a.set(counter++, a.get(upperBound));
			}else{
				a.set(counter++, a.get(upperBound));
			}
			i = upperBound;
		}
		
		//a = (ArrayList<Integer>) a.subList(0, counter);
		a.subList(0, counter);
		System.out.println(a);
		//return a.size();
		return a;
	}
	
	private int findUpperBound(ArrayList<Integer> a, int num, int low){
		int high = a.size()-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(a.get(mid) == num){
				low = mid+1;
			}else if(a.get(mid) > num){
				high = mid-1;
				while(a.get(high)!=num){
					high--;
				}
			}else{
				low++;
			}
		}
		return high;
	}
	public static void main(String[] args) {
		//int[] arr = {1000, 1000, 1000, 1000, 1001, 1002, 1003, 1003, 1004, 1010};
		int[] arr = {0, 2};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			list.add(arr[i]);
		
		System.out.println(new MaxTwoDuplicates().maxTwoDuplicates(list));
	}
}
