
public class Encode {
	public static void main(String[] args) {
		String s = "wwwwaaadexxxxxx";
		encode(s);
	}

	private static void encode(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				count++;
			}
			else{
				sb.append(s.charAt(i-1)).append(count);
				count = 1;
			}
		}
		sb.append(s.charAt(s.length()-1)).append(count);
		System.out.println(sb);
	}
}
