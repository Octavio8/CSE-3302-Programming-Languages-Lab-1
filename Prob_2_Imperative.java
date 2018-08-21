public class Prob_2_Imperative 
{	
	/*Function that will calculate the fibonacci value of a given input recursively. 
	 */
	public static int fibonacci(int fibonacci_to_calculate)
	{
		int fibonacci;
		if(fibonacci_to_calculate <= 1)
		{
			return fibonacci_to_calculate;
		}
		if(fibonacci_to_calculate == 2)
		{
			return 1;
		}
		fibonacci = fibonacci(fibonacci_to_calculate-1) + fibonacci(fibonacci_to_calculate-2);		
		return fibonacci;
	}

	/*Main funciton with for loop that will iterate from 0 to 15 and pass the corresponding value 
	 * to the fibonacci function. It will then print the fibonacci number to the terminal.
	 */
	public static void main(String[] args) 
	{	
		for(int i = 0;i < 16;i++)
		{
			int temp = fibonacci(i);
			System.out.println(temp);
		}
	}
}