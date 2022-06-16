package packageC;

public class AccessModifiers {

	// all these variables are accessible in the methods of the same class
	public int publicVariable=1;
	int defaultVariable=2;
	private int privateVariable=3;
	protected int protectedvariable=4;
	
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicMethod();
		obj.defaultMethod();
		obj.privateMethod();
		obj.protectedMethod();
		
		

	}
	
	public void publicMethod()
	{
		System.out.println("Public Method");
	}
	
	void defaultMethod()
	{
		System.out.println("Default Method");
	}
	
	private void privateMethod()
	{
		System.out.println("Private Method");	
	}
	
	protected void protectedMethod()
	{
		System.out.println("Protected Method");	
	}

}
