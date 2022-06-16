package packageD;

//  import packageC.* will give access to all methods in packageC
import packageC.*;

public class AccessModifiers3 {

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicMethod();
		
		// no access for methods of different package
		//obj.defaultMethod();
		//obj.privateMethod();
		//obj.protectedMethod();

	}

}
