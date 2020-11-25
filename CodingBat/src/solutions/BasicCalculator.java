package solutions;

public class BasicCalculator {
	public static int calculator(int num1, char operator, int num2) {
		
		String nuevo = String.valueOf(operator);
		if (num2 == 0){
			return 0;
		}
		if (nuevo.equals("+") ) {
			return num1 + num2;
		}else if (nuevo.equals("/")) {
			return num1 / num2;
		}else if (nuevo.equals("-")) {
			return num1 - num2;
		}else {
			return num1 * num2;
		}

		
		
	  }

}
