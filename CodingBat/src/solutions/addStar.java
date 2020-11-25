package solutions;

import java.util.ArrayList;
import java.util.List;

public class addStar {
	public List<String> addStar(List<String> strings) {
		  
		List<String> lista = new ArrayList<String>();
		
		for (int i = 0; i < strings.size(); i++) {
			lista.add(strings.get(i) + "*");
		}
		return lista;
		
	}

}
