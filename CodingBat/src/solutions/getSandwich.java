package solutions;

public class getSandwich {
	public String getSandwich(String str) {
		
		if (str.contains("bread")) {
			int first = str.indexOf("bread");
			int last = str.lastIndexOf("bread");
			
			if (first != last) {
				return str.substring(first+5, last);
			}else {
				return "";
			}
			
		}
		
		  return "";
		}

}
