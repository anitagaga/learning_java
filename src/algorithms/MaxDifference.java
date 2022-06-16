package algorithms;

public class MaxDifference {
	
    //given an array of integers, return the difference between the largest and the smallest in the array

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,19};
		
		//MaxDifference maxDifference = new MaxDifference();
		
		int m = maxDifference(arr);
		System.out.println(m);

	}
	
	public static int maxDifference(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		
		int l = arr.length;
		
		for(int i=0; i<l; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
			
			if(arr[i]< min) {
				min = arr[i];
			}
		}
			
		return (max-min);
		
	}

}
