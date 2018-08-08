import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class MergeSorted {

	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	     int finalArray[] = new int[a.size() + b.size()];

		int aIndex = 0;
		int bIndex = 0;
		int finalArrayIndex = 0;

		while (aIndex < a.size() && bIndex < b.size()) {
			if (a.get(aIndex) <= b.get(bIndex)) {
				finalArray[finalArrayIndex++] = a.get(aIndex);
				aIndex++;
			}

			else {
				finalArray[finalArrayIndex++] = b.get(bIndex);
				bIndex++;
			}
		}

		while (aIndex < a.size()) {
			finalArray[finalArrayIndex++] = a.get(aIndex);
			aIndex++;
		}

		while (bIndex < b.size()) {
			finalArray[finalArrayIndex++] = b.get(bIndex);
			bIndex++;
		}

		finalArrayIndex = 0;
		for (; finalArrayIndex < finalArray.length; finalArrayIndex++)
			System.out.print(finalArray[finalArrayIndex] + " ");
	}

	public static void main(String[] args) {
		int arr1[] = {-4,3};
		int arr2[] = {-2,-2};
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(-4);
		l.add(3);
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l.add(-2);
		l.add(-2);
		
		merge(l,l1);
	}

	public void test() {
		String regex = "^[a-zA-Z]";
		Pattern pattern = Pattern.compile(regex);
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String s = "aasjjikkk";
		s = s.toLowerCase();
		s = s.replaceAll("[^a-zA-Z]", "");

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer val = map.get(c);
			if (val != null) {
				map.put(c, new Integer(val + 1));
			} else {
				map.put(c, 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
}