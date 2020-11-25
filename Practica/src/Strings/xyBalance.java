package Strings;

public class xyBalance {
	public boolean xyBalance(String str) {
		
		int x = 0;
		int y = 0;
		
		if (str.length() != 0 && str.charAt(0) == 'x' && str.length() ==1) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				x = i;
			}else if (str.charAt(i) == 'y') {
				y = i;
			}
		}
		if (x > y) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		xyBalance balance = new  xyBalance();
		
		System.out.println(balance.xyBalance("x"));
	}

}
