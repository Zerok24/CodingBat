package solutions;

import java.util.ArrayList;
import java.util.List;

public class UnmixStrings {
	public static String unmix(String str) {
		
		List<Character> list = new ArrayList<Character>();
		List<Character>list2 = new ArrayList<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		if (list.size() %2 == 0) {
			
			for (int i = 0; i < list.size()-1; i+=2) {
				list2.add(list.get(i+1));
				list2.add(list.get(i));
			}

		}else {
			
			for (int i = 0; i < list.size()-2; i+=2) {
				list2.add(list.get(i+1));
				list2.add(list.get(i));
			}
			list2.add(list.get(list.size()-1));
		}

		str = "";
		for (int i = 0; i < list2.size(); i++) {
			str+= list2.get(i);
		}
		return str;
		
	}
	
	public static void main(String[] args) {
		System.out.println(unmix("abcde"));
	}

}
