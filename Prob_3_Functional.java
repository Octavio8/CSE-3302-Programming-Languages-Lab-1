import java.util.function.BinaryOperator;

public class Prob_3_Functional 
{
	/*Lambda expression that will calculate the greatest common divisor of two numbers recursively.
	 * 
	 */
	static BinaryOperator<Integer> gcd = (a,b) -> (a == 0 && b == 0) ? 0 : (b == 0) ? a : Prob_3_Functional.gcd.apply(b,a % b);
	
	/*Main function with two for loops that will iterate from 0 to 9 with the corresponding values 
	 * being passed to the greatest common divisor lambda expression. The gcd value will then print to the terminal.
	 */
	public static void main(String[] args)
	{
		for(int i = 0; i < 10;i++)
		{
			for(int j = 0;j < 10;j++)
			{
				System.out.println(gcd.apply(i,j));
			}
		}
	}
}
