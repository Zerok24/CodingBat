package Strings;

public class prefixAgain {
	
	public boolean prefixAgain(String str, int n)
	{
		String nuevoString = str.substring(0, n);

		
		
		for (int i = n; i <= str.length()-n; i++) 
		{
			if (str.substring(i, n+i).equals(nuevoString) ) 
			{
				return true;
			}
		
			
		}
		
		
		return false;
		
		
	}

	
	public static void main(String[] args) {
		
		prefixAgain prefixAgain = new prefixAgain();
		
		
		System.out.println(prefixAgain.prefixAgain("aa", 1));
		System.out.println(prefixAgain.prefixAgain("aaaa", 2));
		
	}

	

}
