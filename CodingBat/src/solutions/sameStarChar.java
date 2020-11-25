package solutions;

public class sameStarChar {
	public boolean sameStarChar(String str) {
		
		if (str.contains("*")) {
			for (int i = 0; i < str.length()-1; i++) {
				if (i!= 0 && str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)) {
					return false;
				}
			}
		}
		return true;
	}
}
