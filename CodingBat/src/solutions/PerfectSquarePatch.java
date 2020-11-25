package solutions;

public class PerfectSquarePatch {
	public static int[][] squarePatch(int n) {
		
		int [][] doubleInt = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				doubleInt[i][j] = n;
			}
			
		}
		
		return doubleInt;
		
	}
}
