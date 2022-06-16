package polymorphism.overloading;

public class MethodOverlodaing {

	public static void main(String[] args) {
		
		MethodOverlodaing mo = new MethodOverlodaing();
		mo.login(123-23-2323, "password");
		mo.login("anita", "password");
		mo.login(123-123-123, "password", 89343443);

	}
	
	public void login(String s, String p) {
		System.out.println("Successful login");
	}
	
	public void login(int i, String p) {
		System.out.println("Successful login with phone");
	}
	
	public void login(int i, String p, int t) {
		System.out.println("Successful login with phone and token");
	}

}
