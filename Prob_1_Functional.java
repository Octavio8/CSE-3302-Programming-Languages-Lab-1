import java.util.function.UnaryOperator;

public class Prob_1_Functional 
{
	/* Recursive lambda expression. It calculates the factorial of a given number. The base cases of factorial 0
	 * and 1 are checked using the ternary operator ?:
	 */ 
	static UnaryOperator<Long> factorial = a -> (a <= 1) ? 1 : a * Prob_1_Functional.factorial.apply(--a);
	
	public static void main(String[] args)
	{
		/* This for loop iterates from 0 to 15 and it passes the values to the factorial function which returns the 
		 * corresponding factorial value. Within the for loop the value returned from the lambda expression is printed to
		 * the terminal.
		 */
		for(long i = 0;i < 16;i++)
		{				
				System.out.println(factorial.apply(i));			
		}
	}
}
