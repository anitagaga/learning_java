package algorithms;

public class SumElements {

	public static void main(String[] args) {
		int[] myarr = {1,2,3,4,5};
		int sum = sumElement(myarr);
		System.out.println(sum);

	}
	
	public static int sumElement(int[] arr) {
		int sum = 0;
		for(int i=0; i< arr.length; i++) {
			sum+= arr[i];
		}	
		return sum;
		
	}
	

}
