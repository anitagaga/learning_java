package tryCatch;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		try {
		
		int i = 10;
		System.out.println("before devision");
		System.out.println(i/0);
		
		}
		
		//Throwable is a class in java for exceptions
		catch(Throwable t) {
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			t.printStackTrace();
			
			
		}
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("after devision");

	}

}
