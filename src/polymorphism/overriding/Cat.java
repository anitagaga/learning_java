package polymorphism.overriding;

public class Cat extends Animal{

	public static void main(String[] args) {
		Cat ca = new Cat();
		ca.makeNoise();
	}
	
	public void makeNoise() {
		System.out.println("Meows");
	}

}
