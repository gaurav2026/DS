
public class SpiralMatrix {
	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = {
				{ 1, 2, 3, 4, 5, 6 }, 
				{ 7, 8, 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16, 17, 18 } };
		spiralPrint(R, C, a);
	}

	private static void spiralPrint(int r, int c, int[][] a) {
		int i = 0;
		int k = 0;// starting row index
		int l = 0;// starting column index

		while (k < r && l < c) {
			while (l < c) {
				System.out.print(a[k][l] + " ");
				l++;
			}
			l--;
			k++;
			while (k < r) {
				System.out.print(a[k][l] + " ");
				k++;
			}
			k--;
			l--;
			while(l>=0){
				System.out.print(a[k][l]+" ");
				l--;
			}
			l++;
			k--;
			
		}
	}
}
