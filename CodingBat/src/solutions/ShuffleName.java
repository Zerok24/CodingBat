package solutions;

public class ShuffleName {
    public static String nameShuffle(String s) {
       
    	String[] split = s.split("\\s+");
    	
    	return split[1]+ " "+ split[0];
    	
    }

}
