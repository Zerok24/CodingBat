package solutions;

import java.util.ArrayList;
import java.util.List;

public class loneSum {
	public int loneSum(int a, int b, int c) {
		
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		int[] numeros = {a, b,c};
		
		for (int i = 0; i < numeros.length; i++) {
			if (!list.contains(numeros[i])) {
				sum += numeros[i];
				list.add(numeros[i]);
			}
			else if (list.contains(numeros[i])) {
				sum = sum - numeros[i];
			}
		}
		
		if (sum < 0) {
			sum = 0;
			return sum;
		}
		
		return sum;

	}


}
