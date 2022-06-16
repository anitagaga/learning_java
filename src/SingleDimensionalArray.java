
public class SingleDimensionalArray {

	public static void main(String[] args) {
		int myInt = 2;
		int[] myIntArray = new int[10];
		myIntArray[0] = 10;
		myIntArray[1] = 10;
		myIntArray[2] = 20;
		myIntArray[3] = 30;
		myIntArray[4] = 40;
		myIntArray[5] = 50;
		System.out.println(myIntArray[5]);
		System.out.println(myIntArray.length);
		
		int[] myArray1 = {10,20,30,40};
		
		for(int i=0; i<myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		
		System.out.println(myArray1[1]);
		System.out.println(myArray1.length);
		
		int myArray2[] = {10,20,30,40};
		
		String[] myStringArray = new String[5];
		boolean[] myBooleadArray = new boolean [5];
		
	}

}
