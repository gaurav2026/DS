import java.util.ArrayList;
import java.util.List;

public class RangeSearch {

	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		if (a.size() == 0) {
			throw new IllegalArgumentException("Size can't be less than two");
		}

		int lowerIndex = first(a, b, 0, a.size()-1);
		int upperIndex = last(a, b, 0, a.size()-1);
		
		l.add(lowerIndex);
		l.add(upperIndex);
		
		return l;
	}

	private static int first(final List<Integer> a, int b, int low, int high) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if ((mid == 0 || b > a.get(mid - 1)) && a.get(mid) == b ) {
				return mid;
			} else if (b > a.get(mid)) {
				return first(a, b, mid + 1, high);
			} else {
				return first(a, b, low, mid - 1);
			}
		}
		return -1;

	}

	private static int last(final List<Integer> a, int b, int low, int high) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if((mid==a.size()-1 || b < a.get(mid+1)) && a.get(mid)==b ){
				return mid;
			}else if(b < a.get(mid)){
				return last(a, b, low, mid-1);
			}else{
				return last(a, b, mid+1, high);

			}
		}
		return -1;
	}

	public static void main(String[] args) {
		RangeSearch r = new RangeSearch();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(8);

		List<Integer> l = r.searchRange(list, 8);
		System.out.println(l);
	}

}
