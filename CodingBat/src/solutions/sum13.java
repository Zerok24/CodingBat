package solutions;

public class sum13 {
	
	public int sum13(int[] nums) {
		
		int total = 0;
		
		if (nums.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 13 ) {
				total += nums[i];
			}else {
				i += 1;
			}
		}
		
		return total;
	}

}
