public class TwinStrings {

	public static void main(String[] args) {

		String arr1[] = new String[3];
		String arr2[] = new String[3];
		arr1[0] = "cdab";
		arr1[1] = "dcba";
		arr1[2] = "abcd";
		arr2[0] = "abcd";
		arr2[1] = "abcd";
		arr2[2] = "abcdcd";
		String[] arr = checkTwins(arr1, arr2);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	
	}

	public static String[] checkTwins(String a[], String b[]) {
		String arr[] = new String[a.length];
		int i=0;
		for(i=0;i<a.length && i<b.length;i++){
			if(a[i].equals(b[i])){
				arr[i] = "YES";
			}
			else if(a[i].length()!=b[i].length()){
				arr[i] = "NO";
			}
			else{
				String swappedString = swap(a[i]);
				if(swappedString.equals(b[i])){
					arr[i] = "YES";
				}else{
					arr[i] = "NO";
				}
			}
		}
		while(i<a.length){
			arr[i] = "NO";
			i++;
		}
		return arr;

	}
	
	public static String swap(String arr){
		StringBuilder a = new StringBuilder(arr);
		for (int i = 0; i < a.length(); i++) {
			char temp;
			int k = i;
			if ((k + 2) < a.length()) {
				temp = a.charAt(k);
				a.setCharAt(k, a.charAt(k+2));
				a.setCharAt(k+2, temp);
			}
		}
		return a.toString();
	}

}
