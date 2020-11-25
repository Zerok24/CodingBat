package Strings;

public class oneTwo {
	
	public String oneTwo(String str) {
		
		String nuevo = "";
		
		if (str.length() < 3) {
			return "2";
		}
		
		for (int i = 0; i < str.length() -2; i =+3) {
			String three = str.substring(i, i +3);
			char firString = three.charAt(0); 
			char secoString = three.charAt(1);
			char third = three.charAt(2);
			
			nuevo += secoString + firString + three;
			
		}
		return nuevo;
		  
	}
	
	public static void main(String[] args) {
		
		oneTwo two = new oneTwo();
		
		System.out.println(two.oneTwo("catdog"));
		
	}

}
