import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrayOfDifferentLength {

	public static double findMedianOfTwoSortedArrayOfDifferentLength(final List<Integer> a,
			final List<Integer> b) {
		if (a.size() > b.size())
			return findMedianOfTwoSortedArrayOfDifferentLength(b, a);

		int x = a.size();
		int y = b.size();

		int low = 0, high = x;
		while (low <= high) {
			int partitionX = (low + high) / 2;
			int partitionY = (x + y + 1) / 2 - partitionX;
			
			System.out.println(partitionY);

			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : a.get(partitionX - 1);
			int minRightX = (partitionX == x) ? Integer.MAX_VALUE : a.get(partitionX);

			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : b.get(partitionY - 1);
			int minRightY = (partitionY == y) ? Integer.MAX_VALUE : b.get(partitionY);

			if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
				if ((x + y) % 2 == 0) {
					return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
				} else {
					return ((double) Math.max(maxLeftX, maxLeftY));
				}
			} else if (maxLeftX > minRightY) {
				high = partitionX - 1;
			} else {
				low = partitionX + 1;
			}

		}
		return 0;

	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		/*a.add(1);
		a.add(3);
		a.add(8);
		a.add(9);
		a.add(15);
*/
		List<Integer> b = new ArrayList<Integer>();
		/*b.add(7);
		b.add(11);
		b.add(19);
		b.add(21);
		b.add(23);
		b.add(25);*/
		b.add(20);

		System.out.println(findMedianOfTwoSortedArrayOfDifferentLength(a, b));
	}
}
