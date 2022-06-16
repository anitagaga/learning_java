package abstraction;

public abstract class Shapes {
	
	
	// abstract method
	public abstract void drawShape();
	
	public abstract void colorShape();
		//System.out.println("Color shape");
	
	//concrete method 
	public void moveShape() {
		System.out.println("Move shape");
	}
}
