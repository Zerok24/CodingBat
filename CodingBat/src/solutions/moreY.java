package solutions;

import java.util.ArrayList;
import java.util.List;

public class moreY {
	public List<String> moreY(List<String> strings) {
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < strings.size(); i++) {
			list.add("y" + strings.get(i)+"y");
		}
		
		return list;
		
	}

}
