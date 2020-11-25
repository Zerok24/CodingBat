package solutions;

public class SevenBoom {
	public static String sevenBoom(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			String parse = String.valueOf(arr[i]);			
			
			for (int j = 0; j < parse.length(); j++) {
				if (parse.charAt(j) == '7') {
					return "Boom!";
				}
			}
			
		}
		
		return "there is no 7 in the array";
		
	}

}
