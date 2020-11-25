package solutions;

public class sum67 {
	
	public int sum67(int[] nums) {
		
		int sum = 0;
		boolean sixFound = false;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				sixFound = true;
			}
			if (!sixFound) {
				sum += nums[i];
			} 
			if (nums[i] == 7) {
				sixFound = false;
			}
		
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		sum67 sum67 = new sum67();
		int[] numbers = {1, 1, 6, 7, 2};
		
		
		System.out.println(sum67.sum67(numbers));
		
	}

}
