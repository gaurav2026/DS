
public class Test {

	public static void main(String[] args) {
		String s = "aaabbbbcccdddeea";
		countStrings(s);
	}

	public static void countStrings(String s) {
		int counter = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				++counter;
			} else {
				sb.append(s.charAt(i)).append(counter);
				counter = 1;
			}
		}

		System.out.println(sb.toString());
	}

}
