
public class NestedLoopsDemo {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			int j = 1;
			while (j <= 5) {
				// System.out.println("value of i is "+i+". Value of j is "+j);

				for (int x = 1; x <= 2; x++) {
					System.out.println("value of i is " + i + ". Value of j is " + j + ". Value of x is " + x);
					count++;
				}
				j++;

			}
		}
		System.out.println(count);
	}
}
