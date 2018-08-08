import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(1);
		
		int arr[] = {3,4,1,4,1};
		
		System.out.println(new DuplicateElement().repeatedNumber(list));
	}
	
public int repeatedNumber(final List<Integer> a) {
	int[] temp = new int[a.size()];
    int counter = 0;
    int duplicateElement = -1;
    
   for(counter=0;counter<a.size();counter++){
        temp[counter] = a.get(counter);
    }
    
    counter = 0;
    
    for(;counter<temp.length;counter++){
    	if(temp[Math.abs(temp[counter])]>=0){
    		temp[Math.abs(temp[counter])] = -temp[Math.abs(temp[counter])];
    	}
    	else{
    		duplicateElement = Math.abs(temp[counter]);
    		break;
    	}
    }
	    
	    return duplicateElement;
	}
}
