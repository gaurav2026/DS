
public class RotateBy90 {
	public static void main(String[] args) {
		int mat[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

		/**
		 * {1,2}, {4,5} =>> {1,4} {2,5}
		 */
		rotate(mat);
		reverseByColumn(mat);
		print(mat);
	}

	private static void print(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void reverseByColumn(int[][] mat) {
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0, k = mat[0].length-1; j < k; j++, k--) {
				int temp = mat[j][i];
				mat[j][i] = mat[k][i];
				mat[k][i] = temp;
			}
		}
	}

	private static void rotate(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = i; j < mat[i].length; j++) {
				int temp = mat[j][i];
				mat[j][i] = mat[i][j];
				mat[i][j] = temp;
			}
		}

		
	}
}
