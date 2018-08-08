
public class LongestPrefix {
	public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
		findLongestPrefix(arr);
	}

	private static void findLongestPrefix(String[] arr) {
		int minLength = findMinLen(arr);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<minLength;i++){
			char current = arr[0].charAt(i);
			boolean status = false;
			for(int j=1;j<arr.length;j++){
				if(current ==  arr[j].charAt(i)){
					status = true;
				}
				else
					status = false;
			}
			if(status)
				sb.append(current);
		}
		System.out.println(sb.toString());
	}

	private static int findMinLen(String[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			int len = arr[i].length();
			if(len <= min){
				min = len;
			}
		}
		return min;
	}
}
