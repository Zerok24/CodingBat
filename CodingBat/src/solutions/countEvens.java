package solutions;

public class countEvens {
	
	public int countEvens(int[] nums) {
		  
		int isEven = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				isEven++;
			}
		}
		
		return isEven;
	}

}
