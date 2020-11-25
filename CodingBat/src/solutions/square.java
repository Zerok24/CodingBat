package solutions;

import java.util.ArrayList;
import java.util.List;

public class square {
	
	public List<Integer> square(List<Integer> nums) {
		  
		List<Integer> listaIntegers = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			
			listaIntegers.add(nums.get(i) * nums.get(i));
			
		}
		
		return listaIntegers;
		
	}
	

}
