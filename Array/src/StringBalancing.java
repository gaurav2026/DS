import java.util.Stack;

public class StringBalancing {
	public static void main(String[] args) {
		String s = "{()}[]";
		System.out.println(isStringBalanced(s));
	}

	private static boolean isStringBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char k = s.charAt(i);
			if (k == '(' || k == '{' || k == '[') {
				stack.push(k);
			}
			if (k == ')' || k == '}' || k == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (!isBalanced(stack.pop(), k))
						return false;
				}
			}
		}

		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	private static boolean isBalanced(char a, char b) {
		if (a == '(' && b == ')')
			return true;
		else if (a == '{' && b == '}')
			return true;
		else if (a == '[' && b == ']')
			return true;
		else
			return false;

	}
}
