package Strings;

public class xyzThere {
	public boolean xyzThere(String str) {
		String match = "xyz";
		String actual = "";
		
		for (int i = 0; i < str.length()-2; i++) {
			actual = str.substring(i,i+3);
			
			if (actual.equals(match) ) {
				if (i!=0 && str.charAt(i-1) != '.' || i == 0) {
					return true;
				}		
			}
		}
		return false;  
	}

}
