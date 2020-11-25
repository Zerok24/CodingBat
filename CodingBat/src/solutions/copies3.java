package solutions;

import java.util.ArrayList;
import java.util.List;

public class copies3 {
	public List<String> copies3(List<String> strings) {
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < strings.size(); i++) {
			String nuevoString = strings.get(i) +strings.get(i)+strings.get(i) ;
				list.add(nuevoString); 
		}
		
		return list;
		
	}
}
