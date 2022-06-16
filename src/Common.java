
public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int length;
	private int width;
	private int height;
	
	public void seBoxDimension(int l, int b, int h)
	{
		if(l>=1 && b>=1 && h>=1)
		{
		System.out.println("Dimensions "+l+" "+b+" "+h);
		}
		else {
			System.out.println("Invalid dimensions");
		}
		
	}
	
	public int setLength(int l) {
		if(l>=1) {
		length =l;
		}
		else {
			System.out.println("invalid length");
		}
		return length;
		
		
	}
	
	public int setWidth(int w) {
		width =w;
		return width;
		
	}
	
	public int setHeight(int h) {
		height =h;
		return height;
		
	}
	
	public int getHeight() {
		return height;
		
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
		
	}
	
}
