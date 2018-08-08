
public class Replace {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		shift(a);
	}

	private static void swap(int[] a, int l, int h) {
		int t = a[l];
		a[l] = a[h];
		a[h] = t;
	}

	private static void shift(int[] a) {
		int l = 0;
		int h = a.length - 1;
		int m = (l + h) / 2 + 1;
		while (m != h) {
			swap(a, l, m);
			l++;
			m++;
		}

		swap(a, l, h);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
