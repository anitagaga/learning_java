package constructor;

public class ConstructorExamples {
	
	// no return type
	//same name as class name
	public ConstructorExamples() {
		System.out.println("No argument constructor");	
	}
	
	public ConstructorExamples(int i) {
		System.out.println("integer argument constructor");	
	}
	
	public ConstructorExamples(int i, int y ) {
		System.out.println("2 Integer constructor");	
	}
	
	public ConstructorExamples(String s) {
		System.out.println("String constructor");	
	}

	public static void main(String[] args) {
		ConstructorExamples ce = new ConstructorExamples();

	}

}
