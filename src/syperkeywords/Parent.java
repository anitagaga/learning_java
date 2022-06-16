package syperkeywords;

public class Parent {
	
	public Parent() {
		System.out.println("Parent Constructor");
	}
	
	public Parent(int i) {
		System.out.println("Parametrized Constructor");
	}
	
	public Parent(int i, int j) {
		System.out.println("2 Parameters Constructor");
	}
	
	
	String empName = "Tom";
	int empNumber = 142;
	
	public void getData() {
		System.out.println(empName);
		System.out.println(empNumber);
	}

}
