public class Prob_3_Imperative 
{
	/*Function that will calculate the greatest common divisor of two inputs recursively.
	 * 
	 */
	public static int gcd(int i,int j)
	{
		if(i == 0 && j == 0)
		{
			return 0;
		}
		if(j == 0)
		{
			return i;
		}
			return gcd(j,i%j);
	}
	
	/*Main function with two for loops that will iterate from 0 to 9 with the corresponding values 
	 * being passed to the greatest common divisor function. The gcd value will then print to the terminal.
	 */
	public static void main(String[] args) 
	{		
		for(int i = 0; i < 10;i++)
		{
			for(int j = 0;j < 10;j++)
			{
				System.out.println(gcd(i,j));
			}
		}
	}
}
