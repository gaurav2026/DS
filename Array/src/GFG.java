
// Java program to print largest contiguous
// array sum

class GFG {

	static int maxSubArraySum(int a[], int size) {
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 1; i < size; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

	/* Driver program to test maxSubArraySum */
	public static void main(String[] args) {
		int a[] = { 97, 0, -461, -125, -404, -59, -322, -495, -288, -341, -449, -313, -192, -214, -389, -202, -183, -72,
				-416, -455, -187, -242, -416, 39, -198, -338, -465, -248, -25, -398, -97, -461, -214, -423, -407, -77,
				-190, -67, -178, -410, -160, 72, -350, -31, -85, -247, -319, -462, -303, -48, -354, -110, 17, 60, 19,
				80, -218, -28, -426, -366, -140, 50 };
		int n = a.length;
		int max_sum = maxSubArraySum(a, n);
		System.out.println("Maximum contiguous sum is " + max_sum);
	}
}
