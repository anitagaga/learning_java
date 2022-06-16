package packageC;

public class ChildClass extends AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicMethod();
		obj.defaultMethod();
		// no access to private
		//obj.privateMethod();
		obj.protectedMethod();
		
		
		

	}

}
