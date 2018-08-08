
public class Combination {
	public static void combination(int n){
		String s ="";
		printCombination(s,n-1);
	}

	private static void printCombination(String s,int n) {
		if(s.length()==n){
			System.out.println("1"+s);
			return;
		}
		
		printCombination(s+"0", n);
		printCombination(s+"1", n);
	}
	
	public static void main(String[] args) {
		combination(4);
	}
}
