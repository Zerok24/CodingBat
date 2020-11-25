package solutions;

import java.util.Arrays;

public class centeredAverage {
	
	public int centeredAverage(int[] nums) {
		  
		int total = 0;
		Arrays.sort(nums);
		int length = 0;
		for (int i = 1; i < nums.length-1; i++) {
			total += nums[i];
			length++;
		}
		
		return total/length;
	}
	
	public static void main(String[] args) {
		centeredAverage average = new centeredAverage();
		int [] nums = {1,2,3,4,100};
		
		System.out.println(average.centeredAverage(nums));
		
	}

}
