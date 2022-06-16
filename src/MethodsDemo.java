
public class MethodsDemo {

	// call method inside the static class
	public static void main(String[] args) {
		// created an object
		MethodsDemo md = new MethodsDemo();
		md.doLogin();
		md.doLogout();
		doLogin3();
		System.out.println(md.addNumbers(5,10));
		md.diffParameters("this is String", 10, 4.23);

	}

	// static method
	public static void doLogin3() {
		System.out.println("static method Login worked!");
		// login code
	}

	// not returning anything
	public void doLogin() {
		System.out.println("Login worked!");
		// login code
	}

	// this method returns int
	public int doLogin2() {// start
							// login code
		return 10;
	} // end

	// calling a method inside another method
	public void doLogout() {
		doLogin();
		System.out.println("Logout worked!");
	}

	public int addNumbers(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public void diffParameters(String s, int i, double d)
	{
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
	}

}
