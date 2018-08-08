
public class MaximumProdOfThreeNumbers {
	public static void main(String[] args) throws IllegalAccessException {
		int arr[] = { 0, -1, 3, 100, 70, 50 };
		maximumProductOfThreeNumbers(arr);
	}

	private static void maximumProductOfThreeNumbers(int[] arr) throws IllegalAccessException {
		if (arr.length < 3) {
			throw new IllegalAccessException("Minimum 3 elements required");
		}

		int highestProductOfTwo = arr[0] * arr[1];
		int lowestProductOfTwo = arr[0] * arr[1];

		int highestProductOfThree = arr[0] * arr[1] * arr[2];

		int highest = Math.max(arr[0], arr[1]);
		int lowest = Math.min(arr[0], arr[1]);

		for (int i = 2; i < arr.length; i++) {
			int current = arr[i];

			highestProductOfThree = Math.max(Math.max(highestProductOfThree, current * highestProductOfTwo),
					current * lowestProductOfTwo);

			highestProductOfTwo = Math.max(Math.max(highestProductOfTwo, current * highest), current * lowest);

			lowestProductOfTwo = Math.min(Math.min(lowestProductOfTwo, current * highest), current * lowest);

			highest = Math.max(highest, current);

			lowest = Math.min(lowest, current);
		}
		
		System.out.println("Highest : "+ highestProductOfThree);
	}
}
