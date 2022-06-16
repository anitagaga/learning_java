package abstraction;

public class Rectangular extends Shapes {

	public static void main(String[] args) {
		Rectangular re = new Rectangular();
		re.drawShape();
		re.colorShape();
		re.moveShape();

	}

	@Override
	public void drawShape() {
		System.out.println("Drawing rectangular");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Coloring rectangular");
		
	}

	@Override
	public void moveShape() {
		System.out.println("Moving rectangular");
		
	}

}
