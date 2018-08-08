
public class SortedMatrix {
	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		search(mat, 4, 29);
	}

	private static void search(int[][] mat, int N, int x) {
		int i=0;
		int j = N-1;
		while(i<N && j>=0){
			if(mat[i][j] == x){
				System.out.print("n Found at "+ i + " " + j);
				return;
			}
			
			else if(mat[i][j] > x){
				j--;
			}
			
			else{
				i++;
			}
		}
	}
}
