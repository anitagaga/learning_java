package algorithms;

public class FindX {
	
    //stamp.com interview coding task
    // abcdxefghij --> dcbaxefghij
    // find x
    // cut string for string1 string2
    // reverse everything before x --> reversed String1ff
    // combine reversed string and string 2
	
	public static void main(String[] args) {
		
		String givenString = "abcdxefghij";
		String resultString = findX(givenString);
		System.out.println(resultString);
		//int length = findX(givenString);
		//System.out.println(length);
		
	}
	
	public static String findX(String givenString) {
		
		int length = givenString.length();
		int iX = 0;
		
		String String1 = "";
		String String2 = "";
		
		for(int i=0; i<length; i++) {
			char c = givenString.charAt(i);
			if (c == 'x') {
				iX = i;
			}
		}
		
		for (int i = iX; i<length; i++) {
			String2 += givenString.charAt(i);
			
	}
		
		for (int i = iX-1; i>= 0; i--) {
			String1 += givenString.charAt(i);
		}
		
		
		
		//return (length);
		return (String1+String2);
		
	}
	
	
	

}
