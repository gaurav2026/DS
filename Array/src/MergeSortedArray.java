import java.util.ArrayList;

public class MergeSortedArray {

	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	    ArrayList<Integer> mergedList = new ArrayList<Integer>();
	    int maxLen = a.size() >= b.size() ? a.size() : b.size();
	    int indexA = 0;
	    int indexB = 0;
	    
	    for(;indexA<maxLen && indexB < maxLen;){
	        if(a.get(indexA)>=b.get(indexB)){
	            mergedList.add(b.get(indexB));
	            indexB++;
	        }else{
	            mergedList.add(a.get(indexA));
	            indexA++;
	        }
	    }
	    
	    while(indexA!=a.size()){
	    	mergedList.add(a.get(indexA));
	    	indexA++;
	    }
	    
	    while(indexB!=b.size()){
	    	mergedList.add(b.get(indexB));
	    	indexB++;
	    }
	    
	    for(Integer val: mergedList){
	    	System.out.print(val + "  ");
	    }
	}
	
	public static void main(String[] args) {
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 ArrayList<Integer> b = new ArrayList<Integer>();
		 
		 a.add(-4);
		 a.add(3);
		 
		 b.add(-2);
		 b.add(-2);
		 
		 merge(a, b);
	}
	
}
