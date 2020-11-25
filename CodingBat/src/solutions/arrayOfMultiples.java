package solutions;

public class arrayOfMultiples {
	
	public static int[] arrayOfMultiples(int num, int length) {
		
		int [] multiples = new int[length];
		multiples[0] = num;
		
		for (int i = 1; i < length; i++) {
			multiples[i] = num * i;
		}
		
		return multiples;
	
	}
		
}
