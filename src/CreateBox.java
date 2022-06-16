

public class CreateBox {

	public static void main(String[] args) {
		Common cm = new Common();
		//int h = cm.height=10;
		//int l = cm.length=20;
		//int b = cm.width=30;
		
		int l = cm.setLength(2);
		int b = cm.setWidth(20);
		int h = cm.setHeight(15);
		
		cm.seBoxDimension(l, b, h);
		
		System.out.println(cm.getHeight());
		System.out.println(cm.getLength());
		System.out.println(cm.getWidth());

	}

}
