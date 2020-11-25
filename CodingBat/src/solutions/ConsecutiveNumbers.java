package solutions;

import java.util.Arrays;

public class ConsecutiveNumbers {
	public static boolean cons(int[] arr) {
	
		
		Arrays.sort(arr);
		
		System.out.println(arr[1] +1);
		System.out.println(arr[1+1]);
		
		for (int i = 1; i < arr.length; i++) {
			
			
			
			if (arr[i] >= 0 && arr[i-1] >= 0 ) {
				if (arr[i] - arr[i-1] != 1 ) {
					return false;
				}
				
			}
			
			if (arr[i] < 0 && arr[i-1] < 0  ) {
				if (arr[i-1] - arr[i] != -1 ) {
					return false;
				}
				
			}
			if ( arr[i-1] == 0 && arr[i] < 0  ) {
				if (arr[i] - arr[i-1] != arr[i]) {
					return false;
				}
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
	//	System.out.println(cons(new int[] {5,3,4,2,3} ));
		System.out.println(cons(new int[] {-1,0,-2,-3,1} ));
	}

}
