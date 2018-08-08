import java.util.HashSet;
import java.util.Set;

public class UniqueYear {
	public static void main(String[] args) {
		String s = "12-12-1990 this 12-14-1990 23-12-2016 this-is-2015";
		String regex = "\\d+";
		Set<String> set = new HashSet<String>();
		String[] str = s.split("[- ]");
		for(int i=0;i<str.length;i++){
			if(str[i].length()==4 && str[i].matches(regex)){
				set.add(str[i]);
			}
		}
		System.out.println(set);
	}
}
