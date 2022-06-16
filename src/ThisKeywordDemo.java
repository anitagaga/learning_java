
public class ThisKeywordDemo {
	
	int x;
	int y;
	String s = "Hello";

	public ThisKeywordDemo() {
		System.out.println("default");
		
	}
	
	public ThisKeywordDemo(int x, int y) {
		this.x=x;
		this.y=y;
		//x=x;
		//y=y;
		System.out.println(x+y);
		System.out.println("parametrized");
		
	}
	
	public static void main(String[] args) {
		
		ThisKeywordDemo tk = new ThisKeywordDemo(5,8);
		tk.getData();

	}
	
	public void getData() {
		
		//int x=50;
		//int y=40;
		
		System.out.println(this.x+this.y);

	}
	
  public void getData1() {
		
		int x=50;
		int y=40;
		
		System.out.println(this.x+this.y);
		System.out.println(x+y);
	}

}
