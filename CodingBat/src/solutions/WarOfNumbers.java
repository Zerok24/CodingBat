package solutions;

public class WarOfNumbers {
	public static int warOfNumbers(int[]numbers){
		
		int evens = 0;
		int odds = 0;
		int total = 0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evens += numbers[i];
			}
			else {
				odds += numbers[i];
			}
		}
		
		if (evens >= odds) {
			total = evens-odds;
		}
		else {
			total = odds-evens;
		}
		
		return total;
		
	  }
}
