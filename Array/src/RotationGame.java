
public class RotationGame {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 4,3,5 };
		int arr2[] = { 6,9,12};

		rotateArray(arr1, arr2);
	}

	private static void rotateArray(int[] arr1, int[] arr2) {
		int finalArray[] = new int[arr2.length];
		int tempArr[] = new int[arr1.length];
		for(int i=0;i<tempArr.length;i++)
			tempArr[i] = arr1[i];
		for (int i = 0; i < arr2.length; i++) {
			int temp = findMaxElement(arr1, arr2[i],tempArr);
			finalArray[i] = temp;
		}

		for (int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i] + " ");
		}
	}

	private static int findMaxElement(int[] arr1, int d,int[] temp) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = temp[i];
		}
		
		for (int i = 0; i < d; i++) {
			arr1 = rotateByOne(arr1);
		}
		int maxElement = arr1[0];
		int maxElementIndex = 0;
		for (int i=1; i < arr1.length; i++) {
			if (arr1[i] > maxElement) {
				maxElement = arr1[i];
				maxElementIndex = i;
			}
		}
		return maxElementIndex;
		
	}

	private static int[] rotateByOne(int[] arr1) {
		int i = 0;
		int temp = arr1[0];
		for (i = 0; i < arr1.length - 1; i++) {
			arr1[i] = arr1[i + 1];
		}
		arr1[i] = temp;
		return arr1;
	}
}
