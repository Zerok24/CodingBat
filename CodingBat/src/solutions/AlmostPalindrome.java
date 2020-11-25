package solutions;


public class AlmostPalindrome {
	public static boolean almostPalindrome(String str) {
		
		StringBuilder builder = new StringBuilder(str);
		
		if (builder.reverse() == builder) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			
			StringBuilder temp = builder.reverse();
			
			if (temp.deleteCharAt(i) ==builder) {
				return true;
			}

		}
		return false;
		
	}

}
