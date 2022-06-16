package abstraction;

public class Circle extends Shapes{

	public static void main(String[] args) {
		Circle ci = new Circle();
		ci.drawShape();
		ci.colorShape();
		ci.moveShape();
		
		// can not have the following, because Shape is an abstract class
		//Shape s = new Shapes();

	}

	@Override
	public void drawShape() {
		System.out.println("Drawing circle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Coloring circle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("Moving circle");
		
	}

}
