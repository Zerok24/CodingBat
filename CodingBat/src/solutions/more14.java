package solutions;

public class more14 {
	public boolean more14(int[] nums) {
		
		int ones = 0;
		int fours = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 ) {
				ones++;
			}
			if (nums[i] == 4) {
				fours++;
			}
		}
		if (fours < ones) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
