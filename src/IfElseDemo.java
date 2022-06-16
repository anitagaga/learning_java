
public class IfElseDemo {

	public static void main(String[] args) {

		/*
		 * if(expression) { }
		 */

		int num1 = 100;
		int num2 = 20;
		int num3 = 30;

		if (num1 > num2) {
			System.out.println("Number 1 is grater than number 2");
			
			if(num2>num3) 
			{
				System.out.println("nested if else: if");
			}
			else
			{
				System.out.println("nested if else: else");
			}
		}
		else if (num1==num2)
		{
			System.out.println("Number 1 is equal to number 2");
		}
		else if (num1<num2)
		{
			System.out.println("Number 1 is less than number 2");
		}
		else
		{
			System.out.println("Final ELSE statement");
		}

	}

}
