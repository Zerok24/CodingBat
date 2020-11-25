package solutions;

public class NumberDecoder {
	public static String textToNum(String phone) {
		
		String[] lista = {"2ABC","3DEF", "4GHI", "5JKL", "6MNO", "7PQRS", "8TUV", "9WXYZ" }; 
		
		String[] split = phone.split("-");
		String nuevoString = "";
		
		for (int i = 0; i < split.length; i++) {
			nuevoString+= split[i];
		}
		return nuevoString;
		
	}
	public static void main(String[] args) {
		System.out.println(textToNum("123-647-EYES"));
	}

}
