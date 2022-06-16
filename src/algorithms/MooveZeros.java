package algorithms;

public class MooveZeros {
	
    //Given an array nums, write a function to move all 0's to the end of it
    // while maintaining the relative order of the non-zero elements.
    //
    // Example:
    //
    //Input: [0,1,0,3,12]
    //Output: [1,3,12,0,0]

	public static void main(String[] args) {
		int[] arr = {1,0,1,0,0,12,4,5,0,78};
		int[] newarr = moveZeros(arr);
		
		
		for(int i=0; i<newarr.length; i++) {
			System.out.println(newarr[i]);
		}

	}
	
	public static int[] moveZeros(int[] arr) {
		int l = arr.length;
		int[] result = new int [l];
		
		for (int i=0; i< l; i++) {
			result[i] = 0;
		}
		
		
		int j = -1;
		for (int i=0; i<l; i++) {
			
			if(arr[i] != 0) {
				j++;
				result[j] = arr[i];
			}
			else  {
				
			}
		}
		
		
		return (result);
		
	}

}
