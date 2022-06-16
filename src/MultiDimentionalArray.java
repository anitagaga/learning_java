
public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int[][] myMultiDimentionalArray = new int[2][3];
		myMultiDimentionalArray[0][0] =2;
		myMultiDimentionalArray[0][1] =3;
		myMultiDimentionalArray[0][2] =4;
		myMultiDimentionalArray[1][0] =3;
		myMultiDimentionalArray[1][1] =4;
		myMultiDimentionalArray[1][2] =5;
		
		//System.out.println(myMultiDimentionalArray[1][1]);
		int[][] myArray = {{2,3,4},{3,4,5}};
		//System.out.println(myArray[1][1]);
		
		for(int i=0;i<myMultiDimentionalArray.length;i++) {
			for(int j=0;j<myMultiDimentionalArray[i].length;j++) {
				System.out.println(myMultiDimentionalArray[i][j]);	
			}
		}
			
	}

}
