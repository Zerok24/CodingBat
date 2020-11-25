package solutions;

import java.util.Arrays;

public class bigDiff {
	
	public int bigDiff(int[] nums) {
		
		Arrays.sort(nums);
		int respuesta =nums[nums.length-1]  - nums[0];
		return respuesta;
	}
	
	
	public static void main(String[] args) {
		bigDiff diff = new bigDiff();
		
		int[] nums = {10,3,5,6};
		
		
		System.out.println(diff.bigDiff(nums));
	}

}
