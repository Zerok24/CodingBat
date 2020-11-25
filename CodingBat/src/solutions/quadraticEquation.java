package solutions;

public class quadraticEquation {
	public static int quadraticEquation(int a, int b, int c) {
		
		//x=  −b± √b2−4ac
		//	  ---−−−−−−−--
		//        2a
		
		int subtotal = (int)Math.pow(b, 2);
		int second = 4*a*c;
		
		int divisor = 2*a;
		
		double dividen = subtotal - second;
		int negation = Math.negateExact(b);
		
		
		dividen = Math.sqrt(dividen);
		dividen = negation + dividen;
		int total = (int)dividen / divisor;
		
		
		return total;

	  }
	
	public static void main(String[] args) {
		
		System.out.println(quadraticEquation(1, 2, -3));
		
	}

}
