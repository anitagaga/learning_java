package syperkeywords;

public class Child extends Parent{
	
	public Child () {
		super(3);
	};
	
	String empName = "Abby";
	int empNumber = 543;
	
	public void getData() {
		
		//will print parent class
		super.getData();
		
		//will print parent class
		System.out.println(super.empName);
		System.out.println(super.empNumber);
		
		//will print child class
		System.out.println(empName);
		System.out.println(empNumber);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.getData();

	}

}
