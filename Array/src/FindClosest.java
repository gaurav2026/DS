
public class FindClosest {

	public static int findClosest(final int[] A, final int[] B, final int[] C) {
		int indexA = 0, indexB = 0, indexC = 0;
		int difference = Integer.MAX_VALUE;
		
		while(indexA<A.length && indexB<B.length && indexC<C.length){
			int minimum = Math.min(A[indexA], Math.min(B[indexB], C[indexC]));
			int maximum = Math.max(A[indexA], Math.max(B[indexB], C[indexC]));
			
			if(maximum - minimum < difference){
				difference = maximum-minimum;
			}
			
			if(A[indexA]==minimum){
				indexA++;
			}else if(B[indexB]==minimum){
				indexB++;
			}else{
				indexC++;
			}
		}
		return difference;

	}

	public static void main(String[] args) {
		int A[] = { 1, 4, 10 };
		int B[] = { 2, 15, 20 };
		int C[] = { 10, 12 };
		System.out.println(findClosest(A, B, C));

	}
}
