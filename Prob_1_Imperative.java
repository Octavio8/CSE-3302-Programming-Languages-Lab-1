public class Prob_1_Imperative 
{
	/* This function computes the factorial value of a given input recursively
	 */
	public static long factorial(int factorial_to_compute)
	{
		long temp;
		if(factorial_to_compute <= 1)
		{
			return 1;
		}
		temp = factorial_to_compute * factorial(--factorial_to_compute);
		return temp;
	}
	/*Main function with a for loop that will call the factorial function 15 times.
	 * It will pass the values from 0 to 15 to the factorial function, and then it will print
	 * the factorial value to the terminal.
	 */
	public static void main(String[] args) 
	{
		for(int i = 0;i < 16;i++)
		{
			long temp = factorial(i);
			System.out.println(temp);				
		}
	}
}
