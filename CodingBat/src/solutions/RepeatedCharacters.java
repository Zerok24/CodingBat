package solutions;

import java.util.ArrayList;
import java.util.List;

public class RepeatedCharacters {
	public static String unrepeated(String str) {
		
		List<Character> list = new ArrayList<Character>();
		String nuevo = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if (!list.contains(str.charAt(i))) {
				list.add(str.charAt(i));
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			nuevo+= list.get(i);
		}
		
		return nuevo;
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(unrepeated("WWE !!!"));
		
		
	}

}
