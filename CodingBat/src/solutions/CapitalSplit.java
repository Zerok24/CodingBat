package solutions;

public class CapitalSplit {
	public static String capSpace(String txt) {
		
		String nuevo = "";
		
		for (int i = 0; i < txt.length(); i++) {
			if ( Character.isUpperCase(txt.charAt(i)) ) {
				nuevo += " " + txt.charAt(i) ;
				
				
			}else {
				nuevo += String.valueOf(txt.charAt(i));
			}
		}
		
		return nuevo.toLowerCase();
	}
	
	public static void main(String[] args) {
		CapitalSplit capitalSplit = new CapitalSplit();
		
		capitalSplit.capSpace("iLoveMyTeapot");
		
	}
	
		
	

}
