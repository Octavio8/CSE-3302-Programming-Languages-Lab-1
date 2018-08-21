import java.util.function.UnaryOperator;

public class Prob_2_Functional 
{
	/*Lambda function to calculate the fibonacci value of a given input recursively
	 */
	static UnaryOperator<Integer> fibonacci = a -> (a <= 1 ) ? a : (a == 2) ? 1 : 
		Prob_2_Functional.fibonacci.apply(a-1) + Prob_2_Functional.fibonacci.apply(a-2);
	
	/*Main function with for loop that will iterate from 0 to 15 and pass the corresponding value to the fibonacci 
	 * lambda expression. It will then print the fibonacci number to the terminal.
	 */
	public static void main(String[] args)
	{
		for(int i = 0; i < 16; i++)
		{
		System.out.println(fibonacci.apply(i));
		}
	}
}
