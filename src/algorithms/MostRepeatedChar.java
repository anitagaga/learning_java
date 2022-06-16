package algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostRepeatedChar {
	
    // find the most repeated character in String

    //plan
    //init hashmap: <char>:<int> character and correspondent number of occurrences
    // iterate through every char
    //look up if you have the char iny our hashmap storage
    // if you don't have this char: insert to hashmap with value 1
    // if you do have this char in hashmap: increase value by 1

	public static void main(String[] args) {
		
		String mystr = "ANITAGAGARINA";
		char mychar = mostRepeatedChar(mystr);
		System.out.println(mychar);
		
	}
	
	public static char mostRepeatedChar(String givenString) {
		
		HashMap <Character,Integer> result = new HashMap<>();
		
		for(int i =0; i < givenString.length(); i++) {
			Character mychar = givenString.charAt(i);
			if(!result.containsKey(mychar)) {
				result.put(mychar, 1);
			}
			else {
				int currentValue = result.get(mychar);
				currentValue ++;
				result.put(mychar, currentValue);
			}
				
		}
		
		Iterator it = result.entrySet().iterator();
        int maxValue = 0;
        Character winner = givenString.charAt(maxValue);
			
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((Integer) pair.getValue() > maxValue) {
                maxValue = (Integer) pair.getValue();
                winner = (Character) pair.getKey();
            }
        }
        return winner;
		
	}
	
	

}
