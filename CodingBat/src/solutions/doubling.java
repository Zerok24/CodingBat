package solutions;

import java.util.ArrayList;
import java.util.List;

public class doubling {
	
	public List<Integer> doubling(List<Integer> nums) {
		
		List<Integer> listaIntegers =  new ArrayList<Integer>();
		Integer tempInteger = 0;
		
		
		for (int i = 0; i < nums.size(); i++) {
			tempInteger = nums.get(i) * 2;
			listaIntegers.add(tempInteger);
			tempInteger = 0;
		}  
		
		
		return listaIntegers;
	}

}
