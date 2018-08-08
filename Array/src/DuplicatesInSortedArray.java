import java.util.ArrayList;
import java.util.List;

public class DuplicatesInSortedArray {

	
	public int removeDuplicates(List<Integer> list){
		int counter = 0;
		for(int i=0;i<list.size();i++){
			int k = upperIndex(list, list.get(i), i);
			list.set(counter++, list.get(k));
			i = k;
			//finalList.add(list.get(i));
		}
		
		list = list.subList(0, counter);
		System.out.println(list);
		return list.size();
	}
	
	private int upperIndex(List<Integer> list, int num ,int lowerIndex){
		int upIndex = list.size()-1;
		while(lowerIndex<=upIndex){
			int mid = (lowerIndex + upIndex)/2;
			if(list.get(mid) == num){
				lowerIndex = mid+1;
			}else if(list.get(mid) > num){
				upIndex = mid-1;
				while(list.get(upIndex)!=num){
					upIndex--;
				}
			}else{
				lowerIndex++;
			}
		}
		return upIndex;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			list.add(arr[i]);
		
		System.out.println(new DuplicatesInSortedArray().removeDuplicates(list));
		
	}
}
