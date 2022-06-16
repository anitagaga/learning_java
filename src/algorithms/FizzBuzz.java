package algorithms;

import java.util.ArrayList;
import java.util.List;



public class FizzBuzz {

	public static void main(String[] args) {
			int n = 15;		
			List <String> actualResult = fizzBuzz(n);		
			System.out.println(actualResult);
						
	}
	
	public static List <String> fizzBuzz(int n){
		
		List <String> resultList = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			if (i % 15 == 0) {
				resultList.add("FizzBuzz");
			}
			else if (i % 3 == 0) {
				resultList.add("Fizz");
			}
			else if (i % 5 == 0) {
				
				resultList.add("Buzz");
			}
			
			else {
				resultList.add(String.valueOf(i));
			}
		}
		
		
		return resultList;
		
	}

}