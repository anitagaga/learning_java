package packageC;

public class AccessModifiers2 extends  AccessModifiers{

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicMethod();
		obj.defaultMethod();
		// no access to private class of another class, same package
		//obj.privateMethod();
		obj.protectedMethod();
		
		AccessModifiers2 ob2 = new AccessModifiers2();
	//	ob2.defaultVariable;
		

	}

}
