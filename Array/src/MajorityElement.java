import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public int findMajorityElement(int arr[]){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		
		for(Entry<Integer, Integer> iterator : map.entrySet()){
			int key = iterator.getKey();
			if(map.get(key)>(arr.length/2)){
				return key;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		System.out.println(new MajorityElement().findMajorityElement(arr));
	}
}