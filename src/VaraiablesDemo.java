
public class VaraiablesDemo {
	
	// instance variable. All methods inside the class can access this variable
	int j = 20;
	
	//static variable...
	
	//local variables
	public static void main(String[] args) {
		// type variablename = actualvalue;
		// type variable
		int myNumber = 10;
		int secondNumber = 10;
		char ch = 'A';
		String str1 = "Anita";
		
		//concatenate 2 variables string + int; int + int
		System.out.println(str1+" "+myNumber);
		System.out.println(myNumber+secondNumber);
		
	}
	
	// local variable. it is inside the class
	public void myMethod()
	{
		int i =20000;
	}

}
